class Main{
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
    public static int partitionWithPrint(int[] arr, int low , int high){
        int pivot = arr[low];
        int i = low;
        System.out.println("Pivot: " + pivot);
        System.out.println("Low: " + low + ", High: " + high);
        System.out.println("Array State: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int j = low + 1 ; j <= high ; j++){
            System.out.println("Comparing: " + arr[j] + " with pivot: " + pivot);
            if(arr[j] < pivot){
                System.out.println("Swapping " + arr[j] + " and " + arr[i+1]);
                i++;
                System.out.println("Before Swap: ");
                for(int num : arr){
                    System.out.print(num + " ");
                }
                System.out.println();
                swap(arr, i , j);
                System.out.println("After Swap: ");
                for(int num : arr){
                    System.out.print(num + " ");
                }
                System.out.println();
                System.out.println("Swapped " + arr[i] + " and " + arr[j]);
            }
        }
        System.out.println("Placing pivot " + pivot + " at correct position by swapping " + arr[low] + " and " + arr[i]);
        System.out.println("Before Swap: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        swap(arr, low , i);
        System.out.println("After Swap: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        swap(arr, low , i);
        System.out.println("After Swap: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        return i;
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62};
        quickSort(arr, 0 , arr.length - 1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}