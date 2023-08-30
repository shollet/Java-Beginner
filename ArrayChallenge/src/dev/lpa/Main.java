package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int[] myArray = getRandomArray(5);
		System.out.println(Arrays.toString(sortDescendingOrder(myArray)));
		
		System.out.println();
		int[] sortedArray = sortDescendingOrder(new int[] {7, 30, 35, 23});
		System.out.println(Arrays.toString(sortedArray));

	}
	
	public static int[] getRandomArray(int len) {
		
		Random random = new Random();
		int[] myInt = new int[len];
		for (int i = 0; i < len; i++) {
			myInt[i] = random.nextInt(1000);
		}
		
		return myInt;
	}
	
	public static int[] sortDescendingOrder(int[] array) {
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		int tmp;
		int middle = array.length / 2;
		for (int i = 0; i < middle; i++) {
			System.out.println("-----> " + Arrays.toString(array));
			tmp = array[i];
			array[i] = array[array.length - (i + 1)];
			array[array.length - (i + 1)] = tmp;
			System.out.println("-->" + Arrays.toString(array));
		}
		
		return array;
		
	}

}
