package Training;

public class ex90 {
	public static void main(String[] args) {
		Secondsss obj=new Secondsss();
		Thread t1=new Thread(obj,"firstthread");
		Thread t2=new Thread(obj,"secondthread");
		
		t1.start();
		
		t2.start();
		
		
		for(int i=0;i<4;i++) {
			System.out.println("Main method:"+Thread.currentThread().getName());
			
		}
	}
}
class Secondsss implements Runnable{
	
	public void run() {
			System.out.println("The second run");
			
			
			for(int i=10;i<100;i=i+10) {
				System.out.println(i+" "+Thread.currentThread().getName());
				
			}
			
		
	}
}
