
import java.util.*;
public class ex105{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(40);
        a.add(31);
        a.add(10);
        a.add(12);
        System.out.println(a);
        Comparator<Integer> as=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                // TODO Auto-generated method stub
                if(i%10>j%10){
                    return 1;//swap
                }else{
                    return -1;//not swap
                }
            }
        };
        Collections.sort(a);
        System.out.println("Normal sort:"+a);
        Collections.sort(a,as);
        System.out.println("Sorting based on 2nd digit:"+a);
    }
}