public class LinearSearch implements Practice2Search {
	public String searchName() {
		return "Lienar Search";
	}

	public int search(int [] arr, int target) {
		for (int i=0;i<arr.length;i++) {
			// if we found a match
			if (arr[i] == target) {
				return i;
			}
		}

		// if we haven't returned yet, we didn't find it. So return -1 (no match found)
		return -1;
	}

	// Main function used for testing
	public static void main(String[] args) {
		System.out.println("Testing Linear Search.");

		int[] myIntArray = new int[]{1,200,3};

		System.out.println("Should return 1:");

		LinearSearch searcher = new LinearSearch();

		System.out.println(searcher.search(myIntArray,2));

	}
}