package ArrayInterviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class ArrayQuestion {
	
	public static void main(String args[]) {
		
		System.out.println("-----------------Reverse Array------------------------");
		
		// reverse array with single array
		
		int[] arrayone= {1,2,3,4,5};
		int j=arrayone.length-1;
		for(int i=0;i<j;i++) {
			int temp=arrayone[i];
			arrayone[i]=arrayone[j];
			arrayone[j]=temp;
			j--;
		}
		for(int i=0;i<=arrayone.length-1;i++) {
			System.out.print(arrayone[i]);
		}
		
		
		System.out.println("");
		System.out.println("-----------------Duplicate Element in Array------------------------");
		
		// find duplicate in array
		
		int [] duplicateArray= {1,3,4,2,4,5};
		Map<Integer,Integer> mapdata=new HashMap();
		for(int i=0;i<duplicateArray.length;i++) {
			if(mapdata.containsKey(duplicateArray[i])) {
				System.out.println("Duplicate Number is  "+duplicateArray[i]);
			}else {
				mapdata.put(duplicateArray[i], 1);
			}
		}
		
		System.out.println("");
		System.out.println("-----------------Non Duplicate Element in Array------------------------");
		
		// find duplicate in array
		
		int [] nonduplicateArray= {1,3,4,2,4,5,2,5,1};
		Map<Integer,Integer> mapdata1=new HashMap();
		for(int i=0;i<nonduplicateArray.length;i++) {
			if(mapdata1.containsKey(nonduplicateArray[i])) {
				int freq=mapdata1.get(nonduplicateArray[i]);
				mapdata1.put(nonduplicateArray[i], ++freq);
			}else {
				mapdata1.put(nonduplicateArray[i], 1);
			}
		}
		
		for(Integer data:mapdata1.keySet()) {
			if(mapdata1.get(data)<2)
			System.out.println(data+" freq is "+mapdata1.get(data));
		}
		
		/*
		 *  user give a number and we check in array that is sum of two array number is equal to that number
		 *  int[] a={1,2,4,4} and use give 8 then return true because 4+4=8
		 */
		
		int[] checkArray= {1,2,4,4};
		
		int k=0;
		int l=checkArray.length-1;
		boolean result=false;
		int sumnum=6;
		
		while(!(checkArray[l]+checkArray[k]==sumnum)) {
			
			if(k==l || l==0) {
				break;
			}
			
			if(k+l<sumnum && k<l-1) {
				k++;
			}else if(l>0){
				l--;
			}	
		}
		if(checkArray[l]+checkArray[k]==sumnum) {
			result=true;
		}
		System.out.println(result);
		
		
	}
	

}
