class Solution {
	ArrayList<Integer> find(int arr[], int x) {
		// code here
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(findFirst(arr, x));
		list.add(findLast(arr, x));
		return list;
	}
	private int findFirst(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		int firstIdx = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				firstIdx = mid;
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return firstIdx;
	}
	private int findLast(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		int lastIdx = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				lastIdx = mid;
				low = mid + 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return lastIdx;
	}
}