import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        // 이름과 yearning 값을 매핑하기 위한 해시맵
        HashMap<String, Integer> hm = new HashMap<>();

        // 이름과 yearning 값을 해시맵에 저장
        for(int i = 0; i < name.length; i++){
            hm.put(name[i], yearning[i]);
        }

        // 각 사진 별로 찍힌 사람들의 yearning 값을 더해서 answer 배열에 저장
        for(int i = 0; i < photo.length; i++){
            int sum = 0; // 각 사진별로 yearning 값을 합하기 위한 변수

            for(int j = 0; j < photo[i].length; j++){
                String check = photo[i][j]; // 현재 사진에 찍힌 사람의 이름

                // 해당 사람이 해시맵에 존재한다면 (즉, yearning 값이 주어진다면)
                if(hm.containsKey(check)){
                     sum += hm.get(check);  // yearning 값을 더함
                }
                // 각 사진별 yearning 합계를 answer 배열에 저장
                answer[i] = sum;
            }
        }


        return answer;
    }
}