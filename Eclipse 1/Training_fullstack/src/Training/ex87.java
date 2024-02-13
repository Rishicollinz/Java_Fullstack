package Training;

public class ex87 {
	public static void main(String[] args) {
		Second obj=new Second();
		Thread t1=new Thread(obj);
		
		t1.run();
		for(int i=0;i<4;i++) {
			System.out.println("Main method:"+Thread.currentThread().getName());
		}
	}
}
class Second extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Second run:"+Thread.currentThread().getName());
		}
	}
}
