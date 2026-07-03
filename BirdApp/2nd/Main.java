import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdBook myBook = new BirdBook();

        //リスト
        myBook.list.add(new Bird("yukihoojiro", "nishikou"));
        myBook.list.add(new Bird("shimaenaga", "mihara"));
        myBook.list.add(new Bird("benimashiko", "kitazono"));
        myBook.list.add(new Bird("suzume", "kitazono"));
        myBook.list.add(new Bird("akagera", "shouwaminami"));
        myBook.list.add(new Bird("kogera", "mihara"));
        myBook.list.add(new Bird("kirennjaku", "nusamai"));
        myBook.list.add(new Bird("kibitaki", "unndoukouenn"));
        myBook.list.add(new Bird("nobitaki", "sinnfuji"));
        myBook.list.add(new Bird("hakusekirei", "mihara"));
        myBook.list.add(new Bird("kawarahiwa", "shouwatyuuou"));
        myBook.list.add(new Bird("kogera", "sakuragaoka"));
        myBook.list.add(new Bird("shijuukara", "kitazono"));
        myBook.list.add(new Bird("shijuukara", "sakuragaoka"));
        myBook.list.add(new Bird("oowashi", "hoshigaura"));
        myBook.list.add(new Bird("hiyodori", "mihara"));
        myBook.list.add(new Bird("gojuukara", "mihara"));
        myBook.list.add(new Bird("sime", "mihara"));

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
                myBook.birdNameSearch(myBook.list, nameKeyWord);
            }else if(inputMenu.equals("2")){
                System.out.print("検索したい場所を入力：");
                String placeKeyWord = scanner.nextLine();
                myBook.birdPlaceSearch(myBook.list, placeKeyWord);
            }else if(inputMenu.equals("3")){
                System.out.println("---鳥の情報を入力して下さい---");
                System.out.print("鳥の名前：");
                String inputName = scanner.nextLine();
                System.out.print("観察場所：");
                String inputPlace = scanner.nextLine();
                myBook.list.add(new Bird(inputName, inputPlace));
            }else if(inputMenu.equals("4")){
                myBook.show(); 
            }else if(inputMenu.equals("5")){
                System.out.println("お疲れさまでした。終了します");
                break;
            }else{
                System.out.println("1～5の番号を入力して下さい");
            }
        }
 
    }
}