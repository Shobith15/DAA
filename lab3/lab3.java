class Main {
    public static void main(String[] args) {
        int[] a = {5, 3, 4, 1, 2};
        int n = a.length;
        int i, j, temp;

        System.out.print("Initial: ");
        printArray(a);

        for (i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;

            System.out.print("Pass " + i + ": ");
            printArray(a);
        }
    }

    static void printArray(int[] a) {
    int i;
    for (i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
}
}
