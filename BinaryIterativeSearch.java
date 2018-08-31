public class BinaryIterativeSearch implements Practice2Search {
	public String searchName() {
		return "Binary Iterative Search";
	}

	// public int search(int[] arr, int target) {
	// 	return search(arr,target,arr.length-1,0);
	// }

	// private int search(int[] arr, int target, int max, int min) {
	// 	// Debug code:
	// 	// System.out.println("Search called with max = " +  max + " and min = " +min);


	// 	// Base case: min and max have flipped cause we serached everything. return -1 (not found)
	// 	if (min>max) {
	// 		return -1; // Number was not found
	// 	}

	// 	// Iterative step:
		
	// 	int mid = (min+max)/2;

	// 	// DEBUG CODE:
	// 	// System.out.println("About to check stuff. arr[mid] = " + arr[mid] + " and target = " + target + "and mid = " + mid);

	// 	if (arr[mid] == target) { // Check if the middle is the number. If yes, found it!
	// 		return (min+max)/2; // Found it!
		
	// 	} else if (target < arr[mid]) { // If the target is smaller than the mid (in the first half)
	// 		return search(arr,target,mid-1,min); // CALL AGAIN WITH MID REPLACING THE MAX
		
	// 	} else {	// if the target is larger than the mid (in the second half)
	// 		return search(arr,target,max,mid+1);	// CALL AGAIN WITH MID REPLACING THE MAX
	// 	}
	// } 

	public int search(int[] arr, int target) {
		// Debug code:
		// System.out.println("Search called with max = " +  max + " and min = " +min);
		
		// Starting out:
		int max = arr.length-1;
		int min = 0;


		while (true) {
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
				max = mid-1; // CALL AGAIN WITH MID REPLACING THE MAX
				continue;
			
			} else {	// if the target is larger than the mid (in the second half)
				// return search(arr,target,max,mid+1);	// CALL AGAIN WITH MID REPLACING THE min
				min = mid+1;
				continue;
			}
		}
	} 

	// Main function used for testing
	public static void main(String[] args) {
		System.out.println("Testing binary iterative Search.");

		int[] myIntArray = new int[]{100,125,130,150,175,192};

		System.out.println("Should return 3:");

		BinaryIterativeSearch searcher = new BinaryIterativeSearch();

		System.out.println(searcher.search(myIntArray,150));

	}
}