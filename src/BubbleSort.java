package P1_DatastruturesAndAlgorithms;

public class BubbleSort {
    void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
           // System.out.println();
        }
    }

    public static void main(String[] args) {
           BubbleSort ob = new BubbleSort();
           int arr[] ={64,11,25,22,16,90,65};
           ob.bubblesort(arr);
           System.out.println("Sorted Array");
           ob.printArray(arr);
    }
}
