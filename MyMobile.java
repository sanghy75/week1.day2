package week1.day2;

public class MyMobile {

	String objectCategory = "Mobile Phone";
	float size;
	String shape;
	String IMEI = "2345678901234";
	char brandName;
	int resolution = 123;
	byte weight;
	boolean isTouchScreen;
	short costMobile;
	
	public void makeCall() {
		
		System.out.println("Making Calls");
	}
	
	public void sendMsg() {
		System.out.println("Sending Message");

	}
	
	private void payBills() {
		System.out.println("Paying Bills");

	}
	public static void main(String[] args) {
		MyMobile objMob = new MyMobile();
		System.out.println(objMob.brandName);
		System.out.println(objMob.IMEI);
		
		objMob.makeCall();
		objMob.sendMsg();
		objMob.payBills();
	}

}
