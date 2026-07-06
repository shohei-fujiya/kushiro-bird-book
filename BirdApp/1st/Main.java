import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //鳥の記録をため込むリスト
        ArrayList<Bird> birdList = new ArrayList<>();

        //インスタンスを作って、リストに入れる
        birdList.add(new Bird("ノゴマ", "運動公園"));
        birdList.add(new Bird("ベニマシコ", "釧路市北園"));
        birdList.add(new Bird("ハクセキレイ", "釧路市昭和中央"));
        birdList.add(new Bird("ノビタキ", "釧路市新富士"));
        birdList.add(new Bird("シマエナガ", "釧路市美原"));
        birdList.add(new Bird("キレンジャク", "釧路市幣舞"));
        birdList.add(new Bird("オオワシ", "浜中町霧多布"));
        /*Bird bird1 = new Bird("ハクセキレイ", "釧路市昭和中央");
        birdList.add(bird1);
        この２行を１行にするとbirdList.add(new Bird("ハクセキレイ", "釧路市昭和中央"))*/
    
        //入力してもらう
        System.out.print("観察した鳥：");
        String inputBird = scanner.nextLine();
        System.out.print("観察した場所：");
        String inputPlace = scanner.nextLine();
        birdList.add(new Bird(inputBird, inputPlace));
        

        //最新の記録（一番最後に入力したもの）を表示
        int lastIndex = birdList.size() - 1;
        Bird lastBird = birdList.get(lastIndex);

        System.out.println("===最近の観察記録===");
        System.out.println("鳥の名前：" + lastBird.name);
        System.out.println("観察場所：" + lastBird.place);

        System.out.println("===記録一覧===");
        for(Bird birdRecord : birdList){
            System.out.println(birdRecord.name + "(" + birdRecord.place + ")");
        }
    }
}