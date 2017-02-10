package algorithms.testing;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

import algorithms.searching.Search;

public class SearchTester {
	
	private static final int NUMBERS_IN_ARRAY = 10;
	private static final int BOUND = 20;
	private static final int TARGET = 7;

	public static void main(String[] args) {
		
		//Testing binarySearch with iterations
		
		ArrayList<Integer> array = new ArrayList<>();
		Random generator = new Random();
		
		
		for(int i = 0; i < NUMBERS_IN_ARRAY; i++){
			array.add(generator.nextInt(BOUND));
		}
		
		System.out.println("Generated array: " + array);
		
		TreeSet<Integer> set = new TreeSet<>();
		set.addAll(array);
		
		System.out.println("Removed duplicate values and sorted the array: " + set);
		
		array.clear();
		array.addAll(set);
		
		System.out.println("Changed from TreeSet to ArrayList again: " + array);
		
		int position = Search.binarySearch(array, TARGET);
		
		if(position == -1){
			System.out.println("Value " + TARGET + " was not found.");
		}else{
			System.out.println("Value " + TARGET + " found in position " + position);
		}
		
		//Testing binarySearch with recursion
		position = Search.binarySearchRecursion(array, TARGET, 0, array.size() - 1);
		
		if(position == -1){
			System.out.println("Value " + TARGET + " was not found.");
		}else{
			System.out.println("Value " + TARGET + " found in position " + position);
		}
		
	}

}
