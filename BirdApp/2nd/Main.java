import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdBook myBook = new BirdBook();

        
        //メニュー表示
        while (true) {
            System.out.println("\n===メニューを選んでください===");
            System.out.println("1: 鳥の名前で検索");
            System.out.println("2: 観察場所で検索");
            System.out.println("3: 鳥の情報を入力");
            System.out.println("4: 一覧を表示");
            System.out.println("5: データ保存");
            System.out.println("6: 終了");
            System.out.print("番号を入力:");
            String inputMenu = scanner.nextLine();
            
            System.out.println("--------------------------");
            if(inputMenu.equals("1")){
                System.out.print("検索したい鳥の名前を入力：");
                String nameKeyWord = scanner.nextLine().trim();
                if(nameKeyWord.isEmpty()){
                    System.out.println("エラー：名前が入力されていません。名前を入力して下さい。");
                    continue;
                }
                myBook.birdNameSearch(myBook.getBirds(), nameKeyWord);
            }else if(inputMenu.equals("2")){
                System.out.print("検索したい場所を入力：");
                String placeKeyWord = scanner.nextLine().trim();
                if (placeKeyWord.isEmpty()) {
                    System.out.println("エラー：場所が入力されていません。場所を入力して下さい。");
                    continue;
                }
                myBook.birdPlaceSearch(myBook.getBirds(), placeKeyWord);
            }else if(inputMenu.equals("3")){
                System.out.println("---鳥の情報を入力して下さい---");
                System.out.print("鳥の名前：");
                String inputName = scanner.nextLine();
                if (inputName.isEmpty()) {
                    System.out.println("エラー：名前が入力されていません。名前を入力して下さい。");
                    continue;
                }
                System.out.print("観察場所：");
                String inputPlace = scanner.nextLine();
                if (inputPlace.isEmpty()) {
                    System.out.println("エラー：場所が入力されていません。場所を入力して下さい。");
                    continue;
                }
                myBook.addBird(new Bird(inputName, inputPlace));
            }else if(inputMenu.equals("4")){
                myBook.show(); 
            }else if(inputMenu.equals("5")){
                myBook.saveToFile("birdsData.txt");
            }else if(inputMenu.equals("6")){
                System.out.println("お疲れさまでした。終了します");
                break;
            }else{
                System.out.println("1～5の番号を入力して下さい");
            }
        }
 
    }
}