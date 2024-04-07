#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num_list[], size_t num_list_len) {
  int plus = 0;
  int mul = 1;
  for (int i = 0; i < num_list_len; i++) {
    plus += num_list[i];
    mul *= num_list[i];
  }

  if (mul < plus * plus) {
    return 1;
  } else {
    return 0;
  }
}
