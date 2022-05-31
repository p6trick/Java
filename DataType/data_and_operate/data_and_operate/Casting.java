package data_and_operate;

public class Casting {

	public static void main(String[] args) {
		//데이터 타입을 다른 타입으로 변환하는 방법 : Casting
		
		double a = 1.1;
		double b = 1; // int형을 Double로 저장한다면
		double b2 = (double) 1; 
		
		System.out.println(b); // 1.0으로 출력된다.

		// int c = 1.1; // double은 int로 저장할 수 없다. 0.1을 잃어버릴수있기 때문에
		
		double d = 1.1;
		int e = (int) 1.1; //casting을 이용해서 int로 변환.
		
		System.out.println(e); // 1.1이 1로 변한다. 손실이 발생한다.
		
		//1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
	}

}
