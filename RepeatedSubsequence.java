package task;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatedSubsequence {

	public static void main(String[] args) {
		getPairs();
	}

	private static void getPairs() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String Input");
		String input = scanner.next();
		HashSet <String> pairList = new HashSet<>();
		getCombination("",input ,pairList);
		//System.out.println(list);
		//System.out.println(list.size());
		int count =0 ;
		for(String  stringValue : pairList) {
			if(findPattern(stringValue)) {
				count++;
				//System.out.println(stringValue);
			}
		}
		System.out.println(count);
	}
	
	private static void getCombination(String processed , String unProcessed , HashSet<String> list){
		if(processed.length() >= 3 )list.add(processed);
	    if(unProcessed.isEmpty())return;
	    for( int index =0 ;index< unProcessed.length(); index++) {
	    	getCombination(processed+unProcessed.charAt(0) , unProcessed.substring(index+1) , list);
	    	getCombination(""+unProcessed.charAt(0) , unProcessed.substring(index+1) , list);
	    }
	}
	
	private static boolean findPattern(String stringValue) {
		int length = stringValue.length();
		if(length %2 == 0) return stringValue.substring(0,length/2).equals(stringValue.substring(length/2,length));
		return stringValue.substring(0,(length/2)+1).equals(stringValue.substring(length/2,length));
	}
	
}
