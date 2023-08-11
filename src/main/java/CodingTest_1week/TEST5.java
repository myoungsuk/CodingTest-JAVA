package CodingTest_1week;

public class TEST5 {
    public static void main(String[] args){
        int[] capacity = {3, 3, 4};
        solution(10, 3, 4, capacity);
    }

    public static long solution(int N, int M, int K, int[] capacity) {
        long count = 1;

        // 감독관을 배치하는 경우의 수
        for (int i = 0; i < M; i++) {
            count *= (K - i);
        }

        // 학생을 배치하는 경우의 수 (조합을 이용)
        count *= studentCombination(N, capacity, 0, 0);

        return count;
    }

    public static long studentCombination(int remainingStudents, int[] capacity, int idx, int studentsInClass) {
        if (idx == capacity.length) {
            return remainingStudents == 0 ? 1 : 0;
        }

        long count = 0;
        for (int i = 0; i <= capacity[idx] && studentsInClass + i <= remainingStudents; i++) {
            count += studentCombination(remainingStudents - studentsInClass - i, capacity, idx + 1, i);
        }
        System.out.println(count);;
        return count;
    }
}



