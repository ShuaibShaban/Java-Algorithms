// 1 Pseudocode
// 2 Define a method bubbleSort that takes an array of integers.
// 3 Iterate through the array multiple times.
// 4  In each iteration, compare adjacent elements and swap if they are in the wrong order.
// 5  Repeat until the array is sorted.

public class BubbleSort {
    public static void bubbleSort(int[] scores) {
        int n = scores.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (scores[i - 1] > scores[i]) {
                    int temp = scores[i - 1];
                    scores[i - 1] = scores[i];
                    scores[i] = temp;
                    swapped = true;
                }
            }
            n--; // Reduce the array size for optimization
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] examScores = {85, 97, 76, 64, 91};
        bubbleSort(examScores);
        System.out.println("Sorted exam scores: ");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
