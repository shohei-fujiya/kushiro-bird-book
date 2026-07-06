import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BirdBook {
    private ArrayList<Bird> list = new ArrayList<>();

    //外から操作するメソッド
    public void addBird(Bird b){
        this.list.add(b);
    }
    public List<Bird> getBirds(){
        return this.list;
    }

    //起動時に自動でデータを読み込むためのコンストラクタ
    public BirdBook() {
    loadFromFile("birdsData.txt"); 
    }

    //表示メソッド
    public void show(){
        if (list.isEmpty()) {
            System.out.println("まだ登録されたデータがありません。");
            return;            
        }
        System.out.println("");
        System.out.println("===鳥の記録一覧===");
        for(Bird birdRecord : list){
            System.out.println(birdRecord.getName() + "(" + birdRecord.getPlace() + ")");
        }
        System.out.println("");
        System.out.println("===最新の記録===");
        Bird lastBird = list.get(list.size() - 1);
        System.out.println(lastBird.getName() + "(" + lastBird.getPlace() + ")");
    }

    //名前検索メソッド
    public void birdNameSearch(List<Bird> list, String keyword) {
        boolean found = false;
        int count = 0;
        System.out.println("===検索結果（完全一致）===");
        for(Bird birdNameRecord : list){
            if(birdNameRecord.getName().equalsIgnoreCase(keyword)){
                System.out.println("★" + birdNameRecord.getName() + "(" + birdNameRecord.getPlace() + ")");
                found = true;
                count++;
            }
        }
        if(found == false){
            System.out.println("該当なしです");
        }
        System.out.println("計" + count + "件見つかりました");

        System.out.println("===検索結果（関連する鳥）===");
        for(Bird birdNameRecord : list){
            if (birdNameRecord.getName().toLowerCase().contains(keyword.toLowerCase()) && !birdNameRecord.getName().equalsIgnoreCase(keyword)) {
                System.out.println("・" + birdNameRecord.getName() + "(" + birdNameRecord.getPlace() + ")");
            }
        }

    }

    //場所検索メソッド
    public void birdPlaceSearch(List<Bird> list, String keyword){
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        System.out.println("===「" + keyword + "」の検索結果（完全一致）===");
        boolean found = false;
        int count = 0;
        for(Bird birdRecord : list){
            if(birdRecord.getPlace().equalsIgnoreCase(keyword)){

                System.out.println(birdRecord.getName() + "(" + birdRecord.getPlace() + ")");
                found = true;
                count++;
            }
        }
        
        if(found == false){
                System.out.println("該当なしです");
            }

        System.out.println("計" + count + "件見つかりました");

        System.out.println("===「" + keyword + "」の検索結果（関連する場所）===");
        for(Bird birdRecord : list ){
            if (birdRecord.getPlace().toLowerCase().contains(keyword.toLowerCase()) && !birdRecord.getPlace().equalsIgnoreCase(keyword)) {
                System.out.println("・"+ birdRecord.getName() + "(" + birdRecord.getPlace() +")" );
            }
        }
    }

    //データ保存
    public void saveToFile(String filename) { // どのファイル名に保存するかを受け取る
    // try(...) は「終わったら自動でファイルを閉じてね」という安全装置
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            
            // リストの中身を一つずつ順番に取り出す（for文）
            for (Bird b : list) {
                // ここが「保存する形式」の決定！
                // 「名前,場所」という１行のテキストにしてファイルに書き込む
                out.println(b.getName() + "," + b.getPlace()); 
            }
            
        } catch (IOException e) {
            // もし何らかのエラー（書き込み禁止など）があったら教えてくれる
            System.out.println("保存に失敗しました: " + e.getMessage());
        }
    }

    //データ読み込み
    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // コンマで分ける
                if (parts.length == 2) {
                    list.add(new Bird(parts[0], parts[1])); // リストに追加！
                }
            }
        } catch (IOException e) {
            System.out.println("読み込み失敗、またはファイルがありません: " + e.getMessage());
        }
    }
}
