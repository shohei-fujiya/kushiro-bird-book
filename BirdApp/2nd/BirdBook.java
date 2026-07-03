import java.util.ArrayList;

public class BirdBook {
    ArrayList<Bird> list = new ArrayList<>();

    //表示メソッド
    public void show(){
        System.out.println("");
        System.out.println("===鳥の記録一覧===");
        for(Bird birdRecord : list){
            System.out.println(birdRecord.name + "(" + birdRecord.place + ")");
        }
        System.out.println("");
        System.out.println("===最新の記録===");
        Bird lastBird = list.get(list.size() - 1);
        System.out.println(lastBird.name + "(" + lastBird.place + ")");
    }

    //名前検索メソッド
    public void birdNameSearch(ArrayList<Bird> list, String keyword) {
        boolean found = false;
        int count = 0;
        for(Bird birdNameRecord : list){
            if(birdNameRecord.name.equals(keyword)){
                System.out.println(birdNameRecord.name + "(" + birdNameRecord.place + ")");
                found = true;
                count++;
            }
        }
        if(found == false){
            System.out.println("該当なしです");
        }
        System.out.println("計" + count + "件見つかりました");
    }

    //場所検索メソッド
    public void birdPlaceSearch(ArrayList<Bird> list, String keyword){
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        System.out.println("===「" + keyword + "」の検索結果===");
        boolean found = false;
        int count = 0;
        for(Bird birdRecord : list){
            if(birdRecord.place.equals(keyword)){
                System.out.println(birdRecord.name + "(" + birdRecord.place + ")");
                found = true;
                count++;
            }
        }
        
        if(found == false){
                System.out.println("該当なしです");
            }

        System.out.println("計" + count + "件見つかりました");
    }
}
