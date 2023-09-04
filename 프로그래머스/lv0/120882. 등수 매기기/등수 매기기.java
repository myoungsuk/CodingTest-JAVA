import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Double> list = new ArrayList<>();

        //학생의 점수 평균을 리스트에 추가하기
        for(int i = 0; i < score.length; i++){
          list.add((score[i][0] + score[i][1]) / 2.0);
        }

        //점수 평균을 내림차순으로 정렬한 새로운 리스트 만들기
        List<Double> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist, Collections.reverseOrder());

        //순위를 저장할 맵
        Map<Double, Integer> rankMap = new HashMap<>();
        
        // 정렬된 리스트의 인덱스를 이용해 순위를 결정하고 맵에 저장한다
        int rank = 1;
        for(int i = 0; i < sortedlist.size(); i++){
            Double number  = sortedlist.get(i);
            if(!rankMap.containsKey(number)){
                rankMap.put(number, rank);
            }
            rank++;
        }

        // 원래 리스트의 숫자를 슨위맵에서 찾아서 정답 배열에 저장한다
        for(int i = 0; i < list.size(); i++){
            Double number = list.get(i);
            int rankOfNumber = rankMap.get(number);
            answer[i] = rankOfNumber;
        }

        return answer;
    }
}