import java.util.*;


// 클래스를 정의합니다.
public class Main {

    // 인접 리스트를 위한 변수, 방문 여부를 위한 변수, 그리고 각 노드의 부모를 저장할 변수를 선언합니다.
    static int n; // 노드(혹은 정점)의 수
    static boolean[] visited; // 해당 노드를 방문했는지 여부를 나타내는 배열
    static ArrayList<Integer> tree[]; // 트리의 인접 리스트를 나타내는 배열
    static int answer[]; // 각 노드의 부모를 저장하는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 노드의 수를 입력받습니다.

        // 위에서 선언한 배열들을 초기화합니다.
        // 노드 정점의 번호가 1 부터 시작하기 때문에 n+1 크기의 배열을 생성해야된다
        visited = new boolean[n + 1];
        tree = new ArrayList[n + 1];
        answer = new int[n + 1];

        // 각 노드에 대한 인접 리스트를 초기화합니다.
        for (int i = 0; i < tree.length; i++) {
            tree[i] = new ArrayList<>();
        }

        // 노드 간의 연결 상태를 입력받습니다.
        for (int i = 1; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            tree[n1].add(n2);
            tree[n2].add(n1); // 양방향 그래프이므로 양 쪽 모두에 연결 정보를 추가합니다.
        }

        // DFS실행
        DFS(1);

        // 정답 출력
        for (int i = 2; i <= n; i++) {
            System.out.println(answer[i]);
        }
    }


    static void DFS(int number) {
        Stack<Integer> stack = new Stack<>(); // 스택 생성
        stack.push(number); // 첫 번째 노드를 스택에 넣습니다.
        visited[number] = true; // 첫 번째 노드를 방문했다고 표시합니다.

        while (!stack.isEmpty()) {
            int current = stack.pop(); // 스택에서 맨 위의 노드를 꺼냅니다.
            for (int i : tree[current]) { // 꺼낸 노드와 연결된 모든 노드를 확인합니다.
                // 아직 방문하지 않은 노드에 대해서만 실행합니다.
                if (!visited[i]) {
                    visited[i] = true; // 해당 노드를 방문했다고 표시합니다.
                    answer[i] = current; // 해당 노드의 부모를 현재 노드로 설정합니다.
                    stack.push(i); // 해당 노드를 스택에 넣습니다.
                }
            }
        }
    }
}



