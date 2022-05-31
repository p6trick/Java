
//package 가져오기
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoinHome {

	public static void main(String[] args) {
		
		//사용자 입력 받기
		
		
		String id = "Java Apt 507";
		
		//Elevator call		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); //올라갈건데 1층으로 엘베 보내줘
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floor Lamp");
		floorLamp.on();
		

	}

}
