package learnAskInterview;

class EvenOdd extends Thread {
	
	private PrintOddEven printeve;
	int max=10;
	private boolean isEvenNumber;

	public EvenOdd(PrintOddEven printeve, int maxnum, boolean isEvenNumber) {
		super();
		this.printeve = printeve;
		this.max = maxnum;
		this.isEvenNumber = isEvenNumber;
	}



	public void run() {
		int number = isEvenNumber ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
            	printeve.printEven(number);
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
            	printeve.printOdd(number);
                // number+=2;
            }
            number += 2;
        }

    }
	
}

class PrintOddEven {
	
	boolean isOdd = false;
	
	synchronized void printOdd(int a) {
		
		
		while (isOdd == true) {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
		
		System.out.println(Thread.currentThread().getName() + ":" + a);
		System.out.println("Odd Number is"+a);
		isOdd=true;
		notify();
	}
	
	synchronized void printEven(int a) {
		
		while (isOdd == false) {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
		System.out.println(Thread.currentThread().getName() + ":" + a);
		System.out.println("Even Number is"+a);
		isOdd = false;
		notify();
	}
	
}


public class LearnThreadWaitAndNotify {
	
	public static void main(String[] args) {
		PrintOddEven peve=new PrintOddEven();
		EvenOdd eve=new EvenOdd(peve,10, false);
		EvenOdd eve1=new EvenOdd(peve,10, true);
		eve.start();
		eve1.start();	
	}

}
