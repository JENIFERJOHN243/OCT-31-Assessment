package task;

import java.util.Scanner;

public class ArraysOfProducts {
	
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
		int[] leftArray = new int[inputArray.length];
		int[] rightArray = new int[inputArray.length];
		int[] resultArray = new int[inputArray.length];
		int leftMax=1,rightMax=1;
		for(int arrayIndex=0;arrayIndex<inputArray.length;arrayIndex++) {
			leftMax*=inputArray[arrayIndex];
			leftArray[arrayIndex]=leftMax;
			//System.out.print("Left "+leftArray[i]);
		}
		//System.out.println();
		for(int arrayIndex=inputArray.length-1;arrayIndex>=0;arrayIndex--) {
			rightMax*=inputArray[arrayIndex];
			rightArray[arrayIndex]=rightMax;
			//System.out.print("right "+rightArray[i]);
		}
		//System.out.println();
		resultArray[inputArray.length-1]=leftArray[inputArray.length-2];
		resultArray[0]=rightArray[1];
		for(int arrayIndex=1;arrayIndex<inputArray.length-1;arrayIndex++) {
			resultArray[arrayIndex]=leftArray[arrayIndex-1]*rightArray[arrayIndex+1];
			//System.out.println(resultArray[i]);
		}
		for(int arrayIndex=0;arrayIndex<resultArray.length;arrayIndex++) {
			System.out.print(resultArray[arrayIndex]+" ");
		}
	}
}



