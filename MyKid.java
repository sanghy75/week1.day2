package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile objMob = new MyMobile();
		System.out.println(objMob.IMEI);
		System.out.println(objMob.resolution);
		
		objMob.makeCall();
		objMob.sendMsg();
		
	}

}
