public class quick_sort {
    public static void print_sorted_array(int arr[]){
        for(int i=0 ;i< arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static int partition(int arr[], int low , int high){
        int i = low-1;
        int pivot = arr[high];
       for(int j =low;j<high;j++){
           if(arr[j]<pivot){
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
        }
       i++;
       int temp = arr[i];
       arr[i] = pivot;
       arr[high] = temp;
       return i;

    }
    public static void quicksort(int arr[], int low ,int high){
        if(low < high){
            int pidx = partition(arr , low , high);
            quicksort(arr , low ,pidx-1); // left part
            quicksort(arr , pidx+1 , high); // right part
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,4,2,7,9,3};
        quicksort(arr , 0 , arr.length-1);
        print_sorted_array(arr);
    }
}
