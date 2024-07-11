public class BookSearch {
    public static int binarySearch(int[] isbns, int target) {
        int low = 0;
        int high = isbns.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (isbns[mid] == target) {
                return mid;
            } else if (isbns[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] sortedISBNs = {123, 234, 345, 456, 567, 678};
        int targetISBN = 345;
        int result = binarySearch(sortedISBNs, targetISBN);
        if (result != -1) {
            System.out.println("ISBN " + targetISBN + " found at index " + result);
        } else {
            System.out.println("ISBN " + targetISBN + " not found.");
        }
    }
}

// Pseudocode
// 1.Define a method binarySearch that takes a sorted array of integers and a target integer.
// 2.  Initialize low and high indices.
// 3.  While low is less than or equal to high, compute the middle index.
// 4.  If the middle element is the target, return the middle index.
// 5.  If the middle element is less than the target, adjust the low index.
// 6.  If the middle element is greater than the target, adjust the high index.
// 7.  If the loop completes without finding the target, return -1.