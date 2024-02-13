package Training;
import java.util.*;

public class ex95 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<a;i++) {
			list.add(sc.nextLine());
		}
		System.out.println(list);
		
	}
}
