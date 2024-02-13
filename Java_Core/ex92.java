package Training;

public class ex92 {
	public static void main(String[] args) {
		Trainer trainer1=new Trainer(); 
		Ece estu=new Ece(trainer1);
		Cse cstu=new Cse(trainer1);
		Thread t1=new Thread(estu,"t1");
		Thread t2=new Thread(cstu,"t2");
		
		
		t1.start();
		t2.start();
	}
}
class Trainer {
	synchronized void printTable(int n) {
		for(int i=1;i<11;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class Ece implements Runnable{
	Trainer t=new Trainer();
	Ece(Trainer t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
	
}
class Cse implements Runnable{
	Trainer t=new Trainer();
	Cse(Trainer t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
	
}
