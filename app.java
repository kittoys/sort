public class app {
    public static void public static void main(String[] args) throws Exception {
        int[]arr = { 64, 34, 25, 12, 22, 11, 90};
        bubblesort(arr);
        System.out.println("array setelah diurutkan");
        printarray(arr);
        
        int[]arr = { 64, 34, 25, 12, 22, 11, 90};
        bubblesort(arr2);
        System.out.println("array 2 setelah diurutkan");
        printarray(arr2);

        int[]arr = { 64, 34, 25, 12, 22, 11, 90};
        bubblesort(arr3);
        System.out.println("array 3 setelah diurutkan");
        printarray(arr3);
    }

    public class InsertionSort {
        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    
    }

    public class SelectionSort(int arr[])
    {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            pos = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                }
            }
            
            tem = arr[pos];
            arr[pos] = arr[i]
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen arr[j] dengan arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    } 
    
    public static void printarray(int[] arr) {
        int nb = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        
        }
        System.out.println(null);
    }
        
    
}