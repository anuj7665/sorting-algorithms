public class insertion_sort {
    public static void I_sort(int arr[]){
        int n = arr.length;
        for(int i = 1 ; i<n ; i++){
            int j =i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,8};
        I_sort(arr);
        for( int val : arr){
            System.out.print(val);
        }
    }
}
