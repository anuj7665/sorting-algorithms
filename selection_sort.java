public class selection_sort {
    public static void S_sort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i< n-1 ; i++){
            int min_idx = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[min_idx]> arr[j]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main (String args[]){
        int arr[] = {4,5,6,1,2,3};
        S_sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
