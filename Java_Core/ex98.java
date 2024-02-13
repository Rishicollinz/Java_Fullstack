import java.util.*;
public class ex98 {
    public static void main(String[] args) {
        Stack<String> v=new Stack<>();
        v.push("Jammer");
        v.push("mouli");
        
        v.pop();
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }//now the read is in last
        v.pop();//popped
        itr=v.iterator();//without this, the read is already is in last, now read is at first;
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
