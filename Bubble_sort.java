public class Bubble_sort {
    public static void B_sort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            for(int j = 0 ; j<n-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // to print the array only
        for (int k = 0 ; k < n ; k++){
            System.out.print(arr[k]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,8,1,3,7};
        B_sort(arr);
    }
}
