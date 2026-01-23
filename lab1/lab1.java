public class Main {

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            System.out.println("\nPass " + (i + 1));

            for (int j = i + 1; j < n; j++) {
                System.out.println("Compare " + arr[j] + " and " + arr[min]);
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            System.out.print("Array: ");
            printArray(arr);
        }
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("\nSorted: ");
        printArray(arr);
    }
}
