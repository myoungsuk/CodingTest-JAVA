class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1sum = 0;
        int arr2sum = 0;
        
        if(arr1.length > arr2.length){
            return 1;
        }else if(arr2.length > arr1.length){
            return -1;
        }else{
            for(int i : arr1)
                 arr1sum += i;
            for(int i : arr2){
                arr2sum += i;
            }
            if(arr1sum > arr2sum){
                return 1;
            }else if( arr2sum > arr1sum){
                return -1;
            }else{
                return 0;
            }
        }
    }
}