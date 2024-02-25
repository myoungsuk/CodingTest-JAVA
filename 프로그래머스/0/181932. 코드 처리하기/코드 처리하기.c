#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* code) {
    bool mode = 0;
    int len = strlen(code);
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char* answer = (char*)malloc(100001);
    answer[0] = '\0';


    if(code[0] == '\0'){
        return strdup("EMPTY");
    }

    for(int i = 0; i < len; i++){
        if(code[i] == '1') {
            if(mode == 0){
                mode = 1;
            }else {
                mode = 0;
            }
            continue;
        }

        if(mode == 0) {
            if (i % 2 == 0) {
                strncat(answer, &code[i], 1);
            }
        }else {
            if(i % 2 == 1) {
                strncat(answer, &code[i], 1);
            }
        }
    }

    if(answer[0] == '\0'){
        free(answer);
        return strdup("EMPTY");
    }

    return answer;
}