package task;

import java.util.HashSet;


public class RepeatedSubsequence {

	public static void main(String[] args) {
		findPairs();
	}

	private static void findPairs() {
				String input = "ABCA";
				HashSet <String> list = new HashSet<>();
				findCombination("",input ,list);
				//System.out.println(list);
				//System.out.println(list.size());
				int count =0 ;
				for(String  str : list) {
					if(findPattern(str)) {
						count++;
						//System.out.println(str);
					}
				}
				System.out.println(count);
	}
	   private static void findCombination(String p , String up , HashSet<String> list){
	    	if(p.length() >= 3 )list.add(p);
	    	if(up.isEmpty())return;
	    	for( int i =0 ;i< up.length(); i++) {
	    		findCombination(p+up.charAt(0) , up.substring(i+1) , list);
	    		findCombination(""+up.charAt(0) , up.substring(i+1) , list);
	    	}
	    }
	
		private static boolean findPattern(String str) {
			int n = str.length();
		    if(n %2 == 0) {
		    	return str.substring(0,n/2).equals(str.substring(n/2,n));
		    }
			return str.substring(0,(n/2)+1).equals(str.substring(n/2,n));
		}
}
