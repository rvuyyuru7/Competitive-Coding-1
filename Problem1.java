// Find missing number in a sorted array with numbers in range of 1 to N.
// Time Complexity : O(logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int search(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // The number at an index should be equal to index + 1
            if (arr[mid] != mid + 1) {
                // Missing number is in the left side of mid
                right = mid - 1;
            } else {
                // Missing number is in the right side of mid
                left = mid + 1;
            }
        }
        return left + 1; // left pointer always stops one index before the missing number
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        int[] arr = new int[] {1, 2, 3, 5, 6, 7, 8};
        System.out.println(ob.search(arr));
        int[] arr1 = new int[] {1, 2, 4, 5, 6, 7, 8, 9};
        System.out.println(ob.search(arr1));
        int[] arr3 = new int[] {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(ob.search(arr3));
        int[] arr4 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(ob.search(arr4));
    }
}