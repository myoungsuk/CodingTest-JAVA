class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        //제거해야되는 단어들 배열로 정리
        String[] check = {"aya", "ye", "woo", "ma"};
        
        // 단어들이 포함되어있으면 " " 로 바꿔준다   
        // "" 이렇게 먼저 바꿔버리면 wyeoo 같은 경우는 맞다고 처리되서 안된다
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < check.length; j++){
                babbling[i]= babbling[i].replace(check[j], " ");
            }
        }

        //그리고 이제서야 공백을 trim() 을 사용해 공백을 없애준다
        //그리고 나서 babbling[i] 값이 비어있으면 값을 추가해주는 식을 넣어준다
        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].trim();
            if(babbling[i].isEmpty()){
                answer++;
            }
        }


        return answer;
    }
}