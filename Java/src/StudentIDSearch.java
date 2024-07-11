public class StudentIDSearch {
    public static int linearSearch(int[] ids, int target) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == target) {
                return i;
            }
        }
        return -1; // i.e if not found
    }

    public static void main(String[] args) {
        int[] studentIDs = {101, 203, 405, 507, 609};
        int targetID = 405;
        int result = linearSearch(studentIDs, targetID);
        if (result != -1) {
            System.out.println("Student ID " + targetID + " found at index " + result);
        } else {
            System.out.println("Student ID " + targetID + " not found.");
        }
    }
}

// Pseudocode:
// 1. Define a method called "linearSearch" that takes an array of integers and a target integer.
// 2. Iterate through the array
// 3. If the current element equals the target, return the index
// 4. If the loop completes without finding the target, return 1
