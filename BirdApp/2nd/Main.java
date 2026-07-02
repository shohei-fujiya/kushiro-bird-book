import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birdList = new ArrayList<>();

        //リスト
        birdList.add(new Bird("yukihoojiro", "nishikou"));
        birdList.add(new Bird("shimaenaga", "mihara"));
        birdList.add(new Bird("benimashiko", "kitazono"));
        birdList.add(new Bird("suzume", "kitazono"));
        birdList.add(new Bird("akagera", "shouwaminami"));
        birdList.add(new Bird("kogera", "mihara"));
        birdList.add(new Bird("kirennjaku", "nusamai"));
        birdList.add(new Bird("kibitaki", "unndoukouenn"));
        birdList.add(new Bird("nobitaki", "sinnfuji"));
        birdList.add(new Bird("hakusekirei", "mihara"));
        birdList.add(new Bird("kawarahiwa", "shouwatyuuou"));
        birdList.add(new Bird("kogera", "sakuragaoka"));
        birdList.add(new Bird("shijuukara", "kitazono"));
        birdList.add(new Bird("shijuukara", "sakuragaoka"));
        birdList.add(new Bird("oowashi", "hoshigaura"));
        birdList.add(new Bird("hiyodori", "mihara"));
        birdList.add(new Bird("gojuukara", "mihara"));
        birdList.add(new Bird("sime", "mihara"));

        //メニュー表示
        while (true) {
            System.out.println("\n===メニューを選んでください===");
            System.out.println("1: 鳥の名前で検索");
            System.out.println("2: 観察場所で検索");
            System.out.println("3: 鳥の情報を入力");
            System.out.println("4: 一覧を表示");
            System.out.println("5: 終了");
            System.out.print("番号を入力:");
            String inputMenu = scanner.nextLine();
            
            System.out.println("--------------------------");
            if(inputMenu.equals("1")){
                System.out.print("検索したい鳥の名前を入力：");
                String nameKeyWord = scanner.nextLine();
                Bird.birdNameSearch(birdList, nameKeyWord);
            }else if(inputMenu.equals("2")){
                System.out.print("検索したい場所を入力：");
                String placeKeyWord = scanner.nextLine();
                Bird.search(birdList, placeKeyWord);
            }else if(inputMenu.equals("3")){
                System.out.println("---鳥の情報を入力して下さい---");
                System.out.print("鳥の名前：");
                String inputName = scanner.nextLine();
                System.out.print("観察場所：");
                String inputPlace = scanner.nextLine();
                birdList.add(new Bird(inputName, inputPlace));
            }else if(inputMenu.equals("4")){
                Bird.show(birdList); 
            }else if(inputMenu.equals("5")){
                System.out.println("終了します");
                break;
            }else{
                System.out.println("1～5の番号を入力して下さい");
            }
        }


        //入力
        

        //表示
               
    }
}