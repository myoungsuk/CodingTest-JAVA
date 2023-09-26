#include <string>
#include <vector>

using namespace std;

int solution(int price) {
    int answer = 0;

    if(price >= 500000){
        return answer = price * 80 / 100;
    }else if(price >= 300000){
        return answer = price * 90 / 100;
    }else if(price >= 100000){
        return answer = price * 95 / 100;
    }else{
        return price;
    }
}