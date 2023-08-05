package ZerobaseCodingTest;


public class TEST3_3_2 {
    public static void main(String[] args) {

        int[] people = {45, 50, 51, 49, 90, 70};
        int limit = 100;
        solution(people , limit);

    }

    public static int solution(int[] people, int limit) {
        int i = 0;
        int count = 0;
        while(i < people.length){
            if(i+1 < people.length) {
                if (people[i] + people[i + 1] <= limit) {
                    count++;
                    i += 2;
                } else {
                    count++;
                    i += 1;
                }
            }else{
                count++;
                i++;
            }

        }
        System.out.println(count);
        return count;
    }
}