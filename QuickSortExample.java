public class QuickSortExample {

    public static void main(String[] args) {
        int[] data = {34, 7, 23, 32, 5, 62, 19, 12};
        System.out.println("Data SEBELUM diurutkan:");
        printArray(data);
        System.out.println("-----------------------");

        quickSort(data, 0, data.length - 1);

        System.out.println("Data SESUDAH diurutkan:");
        printArray(data);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIdx = partition(arr, low, high);
            quickSort(arr, low, pIdx - 1);
            quickSort(arr, pIdx + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}