import java.util.*;
public class ex102 {
    public static void main(String[] args) {
        LinkedHashMap map=new LinkedHashMap();
        map.put(1,"Jammer");
        map.put("5s",5665);
        map.remove(1);
        //we need set in hashmap
        Set s=map.entrySet();
        //System.out.println(s);
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry) itr.next();//typecast
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}