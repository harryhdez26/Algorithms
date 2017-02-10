package algorithms.sorting;

import java.util.ArrayList;

public class Sort {
	
	public static void insertionSort(ArrayList<Integer> array){
		
		int j, temp;
		
		for (int i = 1; i < array.size(); i++) {
			
			j = i;
			
			while (j > 0 && array.get(j - 1) > array.get(j)) {
				temp = array.get(j);
				array.set(j, array.get(j - 1));
				array.set(j - 1, temp);
				j--;
			}
		}
		
	}
	
	public static void mergeSort(ArrayList<Integer> array){
		
		if(array.size() > 1){
			
			ArrayList<Integer> left = new ArrayList<>();
			ArrayList<Integer> right = new ArrayList<>();
			
			int mid = (array.size() - 1)/2;
				
			for (int i = 0; i <= mid; i++) {
				left.add(array.get(i));
			}
			for (int i = mid + 1; i < array.size(); i++) {
				right.add(array.get(i));
			}
				
			mergeSort(left);
			mergeSort(right);
			
			merge(array, left, right);
		}
	}

	private static void merge(ArrayList<Integer> array, ArrayList<Integer> left, ArrayList<Integer> right) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < left.size() && j < right.size()){
			if(left.get(i) < right.get(j)){
				array.set(k, left.get(i));
				i++;
			}else{
				array.set(k, right.get(j));
				j++;
			}
			k++;
		}
		
		if(i == left.size()) {
			for (int p = j; p < right.size(); p++) {
				array.set(k, right.get(p));
				k++;
			}
		}else if(j == right.size()){
			for (int p = i; p < left.size(); p++) {
				array.set(k, left.get(p));
				k++;
			}
		}
	}

}
