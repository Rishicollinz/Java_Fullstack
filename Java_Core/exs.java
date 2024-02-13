
import java.util.*;

public class exs {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<a;i++) {
			list.add(sc.nextLine());
		}
        list2.addAll(list);//copy all the elements in the arraylist
        list.remove("mango");

        list.remove(2);
        list.set(2,"Mango");
		System.out.println(list);
        System.out.println(list.get(2));

        /* 
        //foreach
        for(String as:list){
            System.out.println(as);
        }
        //Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        */
       // System.out.println("sublist: "+list.subList(0, 3));
        System.out.println(list.contains("sds"));//boolean
        System.out.println(list2);

		
	}
}