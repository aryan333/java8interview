package learnArray;

import java.util.Comparator;

public class LearnFreqSort implements Comparator<LearnFreqSort> {
	
	private int key;
	private int value;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "LearnFreqSort [key=" + key + ", value=" + value + "]";
	}
	@Override
	public int compare(LearnFreqSort o1, LearnFreqSort o2) {
		// TODO Auto-generated method stub
		return o2.getValue()-o1.getValue();
	}
	
	
	

}
