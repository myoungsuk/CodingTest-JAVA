package Programmers;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class ProgrammingBasic {
    public static void main(String[] args) {

        int hp = 23;

        solution(hp);
    }

    public static int solution(int hp) {
        int count = 0;

        while(hp > 0) {
            if(hp % 5 == 0) {
                count += hp / 5;
                hp = 0;
            } else if(hp >= 3) {
                hp -= 3;
                count++;
            } else {
                count += hp;
                hp = 0;
            }
        }

        return count;
    }
}