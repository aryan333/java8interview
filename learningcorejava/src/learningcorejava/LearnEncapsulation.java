package learningcorejava;

// Binding the data with methods.

class Lib{
	
	private String bookName;
	private int count;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}

public class LearnEncapsulation {
	
	public static void main(String[] args) {
		
		Lib l=new Lib();
		
		l.setBookName("Gift of god");
		l.setCount(100);
		
		System.out.println(l.getBookName());
		System.out.println(l.getCount());
		
	}

}
