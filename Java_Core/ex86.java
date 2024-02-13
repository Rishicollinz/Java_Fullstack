package Training;

public class ex86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		es a=new es();
		a.s();
		for(int i=0;i<4;i++) {
			System.out.println("Ex86: "+Thread.currentThread().getName());
		}

	}

}
class es{

	void s() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
