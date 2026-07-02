import java.util.ArrayList;

class Bird {
    String name;
    String place;
    
    Bird(String name, String place){
        this.name = name;
        this.place = place;
    }

    
    //名前検索メソッド
    public static void birdNameSearch(ArrayList<Bird> list, String keyword) {
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
    public static void search(ArrayList<Bird> list, String keyword){
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

        System.out.println("◆計" + count + "件見つかりました");
    }
}