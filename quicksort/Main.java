class SortLibrary{
    public static void bubbleSort(int arr[]){
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1 ; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void quickSort(int[] arr, int low , int high){
        if(low < high){
            int pivotIndex = partition(arr, low , high);
            quickSort(arr, low , pivotIndex - 1);
            quickSort(arr, pivotIndex + 1 , high);
        }
    }
    public static int partition(int[] arr, int low , int high){
        int pivot = arr[low];
        int i = low;
        for(int j = low + 1 ; j <= high ; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, low , i);
        return i;
    }
    public static int partitionWithTwoPointers(int[] arr, int low , int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while(i <= j){
            while(i <= high && arr[i] < pivot){
                i++;
            }
            while(j >= low && arr[j] > pivot){
                j--;
            }
            if(i < j){
                swap(arr, i , j);
                i++;
                j--;
            }
        }
        swap(arr, low , j);
        return j;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class Main{
    public static void main(String[] args) {
        int[] arr ={10,3,2,45,1};
        SortLibrary.insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}