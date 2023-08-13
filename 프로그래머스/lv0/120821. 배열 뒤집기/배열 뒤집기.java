class Solution {
    public static int[] solution(int[] num_list) {

        return factorial(num_list, 0, num_list.length -1);
    }

   public static int[] factorial(int[] arr, int start, int end){

        if(start >= end){
            return arr;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return factorial(arr, start+1, end-1);
   }
}