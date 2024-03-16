public class binary_search {
    public static boolean ite_bs(int arr[] , int target){
        int si = 0;
        int ei =arr.length-1;
        while(si<=ei){
            int mid = si+(ei - si)/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target > arr[mid]){
                si = mid +1;
            }
            else{ei = mid-1;}
        }
        return false;
    }
    public static boolean rec_bs(int arr[] , int si , int ei , int target) {
        if (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (target == arr[mid]) return true;
            else if (target > arr[mid]) {
                rec_bs(arr, mid + 1, ei, target);
            } else {
                rec_bs(arr, 0, mid - 1, target);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println( ite_bs(arr , 0));
        System.out.println( rec_bs(arr , 0 , arr.length-1 ,0));
    }
}
