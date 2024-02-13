package Training;

public class ex85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getId());

	}

}
