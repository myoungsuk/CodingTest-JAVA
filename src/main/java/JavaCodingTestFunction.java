//String[] arr1 = new String[5];
//int[] arr2 = {1, 2, 3};
//
//int N = 3;
//int[] arr3 = new int[N];
//
//
//int arr[] = {10, 8, 11, 2, 3, 0};
//
////1. 오름차순
//Arrays.sort(arr1);
//
////2. 내림차순
//Arrays.sort(arr1, Collections.reverseOrder());
//
////3. 일부만 정렬
//Arrays.sort(arr1, 0, 4);
//
////4. 오름차순 정렬하면 binary search로 특정 값을 찾을 수 있다.
//Arrays.binarySearch(arr1, 2);
//
////5, 배열을 어레이리스트로 변환할 때
//List list = Arrays.asList(arr1);
//
////6. 배열의 특정 범위 자르기
//int tmp[] = Arrays.copyOfRange(arr1, 0, 3);
//
//int[] arr = new arr[3];
//sout(arr.length);
//
//String str = "java";
//sout    (str.length());
//
//ArrayList<Integer> list = new ArrayList<>();
//sout    (list.size());
//
//String
//
//String str = "hello world";
//
//str.split(" ");
//str.substring(0, 5);
//for(int i = 0; i < str.length(); i++) str.charAt(i);
//
////1-1 문자열을 배열로 만들고 싶을 때
//String str = "12345";
//String[] Arr = str.split("");
//
//str = str.toUpperCase();
//str = str.toLowerCase();
//
////한번 쓴 문자열은 변겨 불가. substring 이용해서 새로운 변수로 선언해야함
//String name = "starbucks";
//String newname = name.substring(0,4) + 'b' + name.substring(5);
//
//5.HashMap
//
//1. 선언
//HashMap<String, Integer> hm = new HashMap<>();
//
//2. key-value 넣기
//hm.put("java", 0);
//
//3. 키로 값 가져오기
//hm.get("java");
//
//4. containsKey() 로 존재유무 확인
//if (!hm.containKey("java")) hm.put("java", 1);
//
//5. 특정 키가 없으면 값 설정, 있으면 기존 값 가져오는 함수
//hm.put("java", hm.getOrDefalut("java", 3));
//
//6. keySet() 함수로 맵 순회
//for(String key : hm.KeySet()) {
//    hm.get(key);
//        }
//
//6.ArrayList
//1.선언
//ArrayList<String> list = new ArrayList<>();
//
//2.삽입
//list.add("java");
//list.add(0, "ryu");
//
//3.수정
//list.set(1, "c++");
//
//4.삭제
//list.remove(1);
//
//5. 값 존재 유무 확인
//list.contains("java");
//list.indexOf("ryu");
//
//6.iterator 사용
//Iterator it = list.iterator();
//
//while(it.hasNext()) {
//
//        }
//
//6-2 인덱스 내림차순 순회
//while(it.hasPrevious())  {
//
//        }
//
//7. 중복없이 값을 넣고 싶을 때
//if (list.indexOf(value) < 0) {
//    list.put(value);
// }
//
//8. 리스트 값 하나씩 가져올때 (int 일 경우)
//for(int i = 0; i < list.size(); i++) {
//    list.get(i).intValue();
//        }
//
//Queue
//Queue<Integer> q = new LinkedList<>();
//
//q.add(10);
//q.offer(2);
//
//q.peek();
//q.remove();
//q.poll();
//
//q.clear();
//q.isEmpty();
//
//static class Node{
//    int y;
//    int x;
//    int dist;
//
//    Node(int y, int x, int dist) {
//        this.y = y;
//        this.x = x;
//        this.dist = dist;
//    }
//}
//
//
//Queue<Node> queue = new LinkedList<>();
//queue.add(new Node(1,2,3));
//Node node = queue.poll();
//
//8.우선순위 큐
//
//PriorityQueue<Integer> pq = PriorityQueue<Integer>();
//PriorityQueue<Integer> pq = PriorityQueue<Integer>(Collections.reverseOrder());
//
//pq.add(3);
//
//pq.remove();
//
//pq.peek();
//
//import java.io.IOException;
//import java.util.ProiorityQueue;
//
//public class PQ {
//
//    static class Node{
//        int y;
//        int x;
//
//        Node(int y, int x) {
//            this.y = y;
//            this.x = x;
//        }
//
//        //비교 함수 만들어야함!
//        public int compareTo(Node p) {
//            if(this.y < p.x) {
//                return -1;
//            } else if (this.y == p.y) {
//                if(this.x < p.x) {
//                    return -1;
//                }
//            }
//            return 1;
//        }
//    }
//}
//
//public static void main(String[] args) throws IOException {
//
//    PriorityQueue<Node> pq1 = new PriorityQueue<>(Node::compareTo);
//    pq1.add(new Node(1, 2,));
//    pq1.add(new Node(1, 1));
//}
//
//8.Math 라이브러리
//
//Math.max
//Math.min
//
//Math.abs();
//
//Math.ceil(-3.2);
//Math.floor(-3.2);
//Math.round(-3.26);
//
//double a = 1.23456;
//String b = String.format("%.1f", a);
//
//Math.pow(2,2);
//Math.sqrt(4);