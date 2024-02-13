package Training;


class Stock{
	int num;

	public void getNum() {
		System.out.println("Get: "+num);	
	}

	public void setNum(int num) {
		System.out.println("Set: "+num);
		this.num = num;
	}
	
}

class Producer implements Runnable{
	Stock s;
	int i=0;
	Producer(Stock s){
		this.s=s;
		Thread t1=new Thread(this,"Producer");
		t1.start();
	}
	public void run() {
		int i=0;
		while(true) {
			s.setNum(i++);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}

class Consumer implements Runnable{
	Stock s;
	Consumer(Stock s){
		this.s=s;
		Thread t2=new Thread(this,"Consumer");
		t2.start();
	}
	public void run() {
		while(true) {//loop runs infinitely , produces infinitely , consumer uses infinitely
			s.getNum();
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}

public class ex93 {
	public static void main(String[] args) {
		Stock s=new Stock();
		new Producer(s);
		new Consumer(s);
	}
}
