package Training;

public class ex88 {
	public static void main(String[] args) {
		Seconds obj=new Seconds();
		//Thread t1=new Thread(obj);
		Thread t1=new Thread(obj,"secondthread");//"secondthread" is the name of the thread;
		t1.start();
		
		for(int i=0;i<4;i++) {
			System.out.println("Main method:"+Thread.currentThread().getName());
		}
	}
}
class Seconds extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Second run:"+Thread.currentThread().getName());
		}
	}
}
