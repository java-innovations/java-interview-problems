package com.java.search;

/**
 * This class will search the given array of random numbers using Binary Search Algorithm
 * 
 * @author Nireesha Challa <nireesha78@gmail.com>
 *
 */
public class BinarySearch {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// input array to sort
		int[] input = {10, 70, 40, 90, 30, 80, 50, 20, 60};
		int searchElement = 20;
		
		// Sort the array
		quickSort(input, 0, input.length -1);
		
		// Print the sorted array
//		for (int element : input) {
//			System.out.println(element);
//		}
		
		// Search the given element
		int elementIndex = binarySearch(input, searchElement, 0, input.length);
		
		if(elementIndex < 0) {
			System.out.println("Given search element '" + searchElement + "' not found in the input array");
		} else {
			System.out.println("Given search element '" + searchElement + "' found in the input array");
		}
	}
	
	/**
	 * Searches for the given element in the given array and returns its index
	 * 
	 * @param input
	 * @param searchElement
	 * @return Returns index of the element in the sorted array, otherwise it returns -1
	 */
	public static int binarySearch(int[] input, int searchElement) {
		
		// If input array is null or empty, then return -1
		if(input == null || input.length == 0) {
			return -1;
		}
		
		// Sort the array
		quickSort(input, 0, input.length -1);
		return binarySearch(input, searchElement, 0, input.length -1);
	}
	
	/**
	 * Searches for the given element in the provided sorted array recursively using Binary Search Algorithm
	 * 
	 * @param input
	 * @param searchElement
	 * @param leftIndex
	 * @param rightIndex
	 * @return Returns index of the element in the sorted array, otherwise it returns -1
	 */
	private static int binarySearch(int[] input, int searchElement, int leftIndex, int rightIndex) {
		if (rightIndex < leftIndex)
			return -1;
		
		int midElementIndex = (leftIndex + rightIndex) / 2;

		if (searchElement < input[midElementIndex]) {
			return binarySearch(input, searchElement, leftIndex, midElementIndex - 1);
		} else if (searchElement > input[midElementIndex]) {
			return binarySearch(input, searchElement, midElementIndex + 1, rightIndex);
		} else {
			return midElementIndex;
		}
	}

	/**
	 * Sorts given array using Quick Sort technique
	 * 
	 * @param array
	 * @param lowIndex
	 * @param highIndex
	 */
	public static void quickSort(int[] array, int lowIndex, int highIndex) {
		
		int pivotIndex = (lowIndex + highIndex) / 2;
		int pivotElement = array[pivotIndex];
		
		int leftIndex = lowIndex;
		int rightIndex = highIndex;
		
		while (leftIndex <= rightIndex) {
			
			// Compare each left array element with pivot element, 
			// if any element is greater than pivot element, then move it to right side array
			while (array[leftIndex] < pivotElement) {
				leftIndex++;
			}
			
			// Compare each right array element with pivot element
			// if any element is less than pivot element, then move it to left side of array
			while (array[rightIndex] > pivotElement) {
				rightIndex--;
			}
			
			// Swap elements to other side of pivotal element, 
			// if higher element found in left array compared to pivot element, OR
			// if lower element found in right array compared to pivot element
			if (leftIndex <= rightIndex) {
				swapElements(array, leftIndex, rightIndex);
				
				// After swapping update the indexes, as we have swapped the elements
				leftIndex++;
				rightIndex--;
			}
		}
		
		// Sort the left array recursively
		if(lowIndex < rightIndex)
			quickSort(array, lowIndex, rightIndex);
		
		// Sort the right array recursively
		if(leftIndex < highIndex)
			quickSort(array, leftIndex, highIndex);
		
	}

	/**
	 * Swaps elements in the array at given indexes
	 * 
	 * @param array
	 * @param leftIndex
	 * @param rightIndex
	 */
	private static void swapElements(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}

}
