package ZeroBaseHomeWork;

import java.util.*;

public class Mission_1_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("내 좌표 X값을 입력해 주세요.");
        int x = sc.nextInt();
        System.out.println("내 좌표 Y값을 입력해 주세요.");
        int y = sc.nextInt();
        solution(x, y);
    }

    public static int solution(int x , int y){
        List<String> lists = new ArrayList<>();
        List<Double> dis_lists = new ArrayList<>();
        int xx,yy;
        double Distance = Double.MAX_VALUE;
        int Xclose = 0;
        int Yclose = 0;

        while(lists.size() < 10){
            System.out.println(lists.size()+1 + "/10 번째 입력");
            System.out.println("임의의 좌표 x값을 입력해 주세요. ");
            xx = sc.nextInt();
            System.out.println("임의의 좌표 y값을 입력해 주세요. ");
            yy = sc.nextInt();

            String list = "(" + xx + ", " + yy + ")";
            if(lists.contains(list)){
                System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해 주세요.");
                continue;
            }

            lists.add(list);


            double dis = Math.sqrt(Math.pow(xx - x, 2) + Math.pow(yy - y, 2));
            dis_lists.add(dis);
            if(dis < Distance) {
                Distance = dis;
                Xclose = xx;
                Yclose = yy;
            }
        }

        for(int i = 0; i < lists.size(); i++){
            System.out.println(lists.get(i) + " => " + String.format("%.6f", dis_lists.get(i)));
        }

        System.out.println("제일 가까운 좌표:");
        System.out.println("(" + Xclose + ", " + Yclose + ") => " + String.format("%.6f", Distance));

        return 0;
    }
}
