package Training;

public class ex91 {
	public static void main(String[] args) {
		Secondssss obj=new Secondssss();
		Thread t1=new Thread(obj,"firstthread");
		Thread t2=new Thread(obj,"secondthread");
		
		t1.start();
		
		t2.start();
		
	}
}
class Secondssss implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Interruption occurs");
			}
		}
	}
}