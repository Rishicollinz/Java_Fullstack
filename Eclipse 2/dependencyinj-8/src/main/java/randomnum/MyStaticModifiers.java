package randomnum;

public class MyStaticModifiers {
	private static int data;
	private static int mydata;
	public static int getData() {
		return data;
	}
	public static void setData(int data) {
		MyStaticModifiers.data = data;
	}
	public static int getMydata() {
		return mydata;
	}
	public static void setMydata(int mydata) {
		MyStaticModifiers.mydata = mydata;
	}
	
	
}
