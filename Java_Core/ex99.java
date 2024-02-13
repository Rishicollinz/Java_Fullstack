import java.util.*;
public class ex99 {
    public static void main(String[] args) {
        HashSet<String> v=new HashSet<>();
        String as=null;
        v.add("suyash");
        v.add("suyash");//Duplicates element removed;
        v.add(as);
        System.out.println(v);
    }
}
