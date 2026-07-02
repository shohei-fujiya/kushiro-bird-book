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


}
