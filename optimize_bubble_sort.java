public class optimize_bubble_sort {
    public static void optimize_B_sort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            boolean flag = false;
            for(int j = 0 ; j<n-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,9,4,6};
        optimize_B_sort(arr);
        // to print the array only
        for (int k = 0 ; k < arr.length; k++){
            System.out.print(arr[k]);
        }
    }
}
