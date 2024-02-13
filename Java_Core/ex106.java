
import java.util.*;
public class ex106{
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("Mubaasim");
        a.add("Aslam");
        a.add("Jammer");
        a.add("Mouli");
        System.out.println(a);
        Comparator<String> as=new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                // TODO Auto-generated method stub
                if(i.charAt(1)>j.charAt(1)){
                    return 1;//swap
                }else{
                    return -1;//not swap
                }
            }
        };
        Collections.sort(a);
        System.out.println("Normal sort:"+a);
        Collections.sort(a,as);
        System.out.println("Sorting based on 2nd letter:"+a);
    }
}