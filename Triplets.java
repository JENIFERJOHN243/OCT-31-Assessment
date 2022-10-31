package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Triplets {

	public static void main(String[] args) {
		getInput();
	}

	private static void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int[] inputArray = new int[scanner.nextInt()];
		System.out.println("Enter the elements of an array");
		for(int arrayIndex=0;arrayIndex<inputArray.length;arrayIndex++) {
			inputArray[arrayIndex]=scanner.nextInt();
		}

		Set<List<Integer>> res  = new HashSet<>();
        if(inputArray.length==0) System.out.println(new ArrayList<>(res));
        Arrays.sort(inputArray);
        for(int i=0; i<inputArray.length-2;i++){
            int j =i+1;
           int  k = inputArray.length-1;
            while(j<k){
                int sum = inputArray[i]+inputArray[j]+inputArray[k];
                if(sum==0)res.add(Arrays.asList(inputArray[i],inputArray[j++],inputArray[k--]));
                else if (sum >0) k--;
                else if (sum<0) j++;
            }

        }
       System.out.println(new ArrayList<>(res)); 
   }
}
