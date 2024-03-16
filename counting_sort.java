public class counting_sort {
    public static int findmax(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void basiccountsort(int arr[]){
        int max = findmax(arr);
        int count[] = new int[max+1];
        for(int i = 0 ; i< arr.length ;i++){
            count[arr[i]]++;
       }
        int k = 0;
        for(int i = 0 ; i < count.length ; i++ ){
            for(int j = 0 ; j<count[i] ; j++){
                arr[k++] = i;
            }
        }
    }
    public static void stable_countsort(int arr[]){
        int max = findmax(arr);
        int count[] = new int[max+1];
        for(int i = 0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }
        // convert count array in prefix sum array
        for(int i = 1 ; i< count.length ; i++){
            count[i] = count[i]+count[i-1];
        }
        int answer[] = new int[arr.length];
        for(int i = arr.length-1 ; i >=0 ; i--){
            int idx  = count[arr[i]] - 1;
            answer[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all elements of answer in given original array
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = answer[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,1,5,3,1,3,5};
        basiccountsort(arr);
        for(int val : arr){
            System.out.print(val);
        }
        System.out.println();
        stable_countsort(arr);
        for(int val : arr){
            System.out.print(val);
        }
    }
}
