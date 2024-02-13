package Training;


interface printable{  
	void print();
	void display(); 
}  
class ex108 implements printable{  
	public void print(){
		System.out.println("Hello");
	}  
	public static void main(String args[]){  
		ex108 obj = new ex108();  
		obj.print();  
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	} 
}  