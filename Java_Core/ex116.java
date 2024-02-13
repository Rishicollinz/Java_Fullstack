import java.util.function.Consumer;
import java.util.ArrayList;
// class A implements Consumer<Integer>
// {
//     public void accept(Integer i)
//     {
//         System.out.println(i);
//     }
// }
public class ex116 {
    
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(1);
        //enhanced foreach
        //l.forEach(i->System.out.println(i));

        // Consumer<Integer> c=new A();
        // l.forEach(c);

        Consumer<Integer> c=new Consumer<Integer>() {
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        l.forEach(c);

    }
}
