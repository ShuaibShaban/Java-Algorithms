// Pseudocode
// Define a method insertionSort that takes an array of integers.
// Iterate through the array starting from the second element.
// For each element, compare it to the previous elements and insert it in the correct position.
// Repeat until the array is sorted.

public class InsertionSort {
    public static void insertionSort(int[] deck) {
        for (int i = 1; i < deck.length; i++) {
            int key = deck[i];
            int j = i - 1;
            while (j >= 0 && deck[j] > key) {
                deck[j + 1] = deck[j];
                j--;
            }
            deck[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] deckOfCards = {10, 4, 7, 3, 8, 5};
        insertionSort(deckOfCards);
        System.out.println("Sorted deck of cards: ");
        for (int card : deckOfCards) {
            System.out.print(card + " ");
        }
    }
}
