package algorithms.searching;

import java.util.ArrayList;

public class Search {
	
	public static int binarySearch(ArrayList<Integer> array, int target){
		
		int beg = 0;
		int last = array.size() - 1;
		int mid = (beg + last)/2;
		
		while(beg <= last){
			if(array.get(mid) < target){
				beg = mid + 1;
				mid = (beg + last)/2;
			}else if(array.get(mid) > target){
				last = mid - 1;
				mid = (beg + last)/2;
			}else{
				return mid;
			}
		}
		
		return -1;
	}
	
	public static int binarySearchRecursion(ArrayList<Integer> array, int target, int low, int high){
		 
		int mid = (low + high)/2;	
		
		if(array.get(mid) == target){
			return mid;
		}else if(high <= low){
			return -1;
		}else if(array.get(mid) < target){
			return binarySearchRecursion(array, target, mid + 1, high);
		}else{
			return binarySearchRecursion(array, target, low, mid - 1);
		}
	
	}

}
