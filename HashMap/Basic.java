package HashMap;
import java.util.HashMap;
public class Basic {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(01,"harry");
        map.put(02,"potter");
        map.put(03, "ron");
        System.out.println(map.size());
        System.out.println(map);
    
        if(map.containsKey(1)){
            String b = map.get(1);
            System.out.println(b);
        }
        System.out.println(map.containsKey(3));
        map.remove(3);
        System.out.print(map);


    }
}
