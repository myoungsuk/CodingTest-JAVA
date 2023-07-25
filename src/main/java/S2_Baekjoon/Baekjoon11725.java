package S2_Baekjoon;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Node 클래스 선언

public class Baekjoon11725 {

    static class Node {
        int val;
        ArrayList<Node> neighbors = new ArrayList<>();

        //생성자
        public Node(int val) {
            this.val = val;
        }

        //이웃 노드 추가 메서드
        public void addNeighbor(Node node){
            neighbors.add(node);
        }
    }

    public static void main(String[] args){
        int[][] edges = {
                {1, 6},
                {6, 3},
                {3, 5},
                {4, 1},
                {2, 4},
                {2, 7},
        };

        //그래프 생성
        HashMap<Integer, Node> graph = createGraph(edges);
        //각 노드의 부모 노드를 저장하는 맵
        HashMap<Integer, Integer> parents = new HashMap<>();
        //1번 노드부터 DFS시작, 시작 노드의 부모 노드는 없으므로 -1
        dfs(1, -1, graph, parents);

        // 각 노드의 부모 노드 출력
        for(Map.Entry<Integer, Integer> entry : parents.entrySet()) {
            System.out.println("Node : " + entry.getKey() + " parent : " + entry.getValue());
        }
    }

    //그래프 생성 함수
    public static HashMap<Integer, Node> createGraph(int[][] edges) {
        HashMap<Integer, Node> graph = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            //노드가 그래프에 있으면 새로 생성, 있으면 가져옴
            Node node1 = graph.getOrDefault(edges[i][0], new Node(edges[i][0]));
            Node node2 = graph.getOrDefault(edges[i][1], new Node(edges[i][1]));

            // 서로를 이웃으로 추가
            node1.addNeighbor(node2);
            node2.addNeighbor(node1);

            //그래프에 노드 정보 업데이트
            graph.put(edges[i][0], node1);
            graph.put(edges[i][1], node2);
        }
        return graph;
    }

    //DFS 함수
    public static void dfs(int node, int parent, HashMap<Integer, Node> graph, HashMap<Integer, Integer> parents){
        //현재 노드의 부모 노드 정보 저장
        parents.put(node, parent);
        //이웃 노드 목록 가져오기
        ArrayList<Node> neighbors = graph.get(node).neighbors;

        for(Node neighbor : neighbors){
            //이웃 노드가 아직 방문되지 않았다면 재귀적으로 DFS 호출
            if(parents.get(neighbor.val) == null){
                dfs(neighbor.val, node, graph, parents);
            }
        }
    }


}

