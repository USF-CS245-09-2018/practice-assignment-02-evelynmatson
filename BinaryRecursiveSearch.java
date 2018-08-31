public class BinaryRecursiveSearch implements Practice2Search {
	public String searchName() {
		return "Binary Recursive Search";
	}

	// Call the main one that needs the max and min
	public int search(int[] arr, int target) {
		return search(arr,target,arr.length-1,0);
	}

	private int search(int[] arr, int target, int max, int min) {
		// Debug code:
		// System.out.println("Search called with max = " +  max + " and min = " +min);


		// Base case: min and max have flipped cause we serached everything. return -1 (not found)
		if (min>max) {
			return -1; // Number was not found
		}

		// Iterative step:
		
		int mid = (min+max)/2;

		// DEBUG CODE:
		// System.out.println("About to check stuff. arr[mid] = " + arr[mid] + " and target = " + target + "and mid = " + mid);

		if (arr[mid] == target) { // Check if the middle is the number. If yes, found it!
			return (min+max)/2; // Found it!
		
		} else if (target < arr[mid]) { // If the target is smaller than the mid (in the first half)
			return search(arr,target,mid-1,min); // CALL AGAIN WITH MID REPLACING THE MAX
		
		} else {	// if the target is larger than the mid (in the second half)
			return search(arr,target,max,mid+1);	// CALL AGAIN WITH MID REPLACING THE MAX
		}
	} 

	// Main function used for testing
	public static void main(String[] args) {
		System.out.println("Testing binary recursive Search.");

		int[] myIntArray = new int[]{100,125,130,150,175,192};

		System.out.println("Should return 3:");

		BinaryRecursiveSearch searcher = new BinaryRecursiveSearch();

		System.out.println(searcher.search(myIntArray,150));

	}
}