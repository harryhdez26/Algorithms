package algorithms.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import algorithms.sorting.Sort;

public class SortTester {
	
	private static final int ARRAY_SIZE = 5;
	private static final int BOUND = 10;

	public static void main(String[] args) {
		 ArrayList<Integer> array = new ArrayList<>();
		 Random generator = new Random();
		 
		 for(int i = 0; i < ARRAY_SIZE; i++){
			 array.add(generator.nextInt(BOUND));
		 }
		 
//		 System.out.println("Before insertionSort: " + array);
//		 
//		 Sort.insertionSort(array);
//		 
//		 System.out.println("After insertionSort: " + array);
		 
		 System.out.println("Before mergeSort: " + array);
		 
		 Sort.mergeSort(array);
		 
		 System.out.println("After mergeSort: " + array);
	}

}
