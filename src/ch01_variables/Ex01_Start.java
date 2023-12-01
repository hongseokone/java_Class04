package ch01_variables;

public class Ex01_Start {

	public static void main(String[] args) {
		// 본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호(mobile)
		// 를 입력할 수 있는 변수를 각각 선언해봅시다.ㅎ
		// 변수 선언
		// String; // x 타입만 주면 안됨
		// name = "이름"; /// x 변수이름만 주면 안됨
		String name = "홍석원";
		int age = 29;
		double height = 160.2;
		String address = "인천광역시";
		String mobile = "010-2225-8996";
		
		// 변수값 출력
		// System.out.println("name"); / ""에들어있는거 그대로출력
		// System.out.println(name); / name이라는 값을 불러올수있다.
		// System.out.println("저의 이름은 : " + name ); // 같이출력을해주는경우에는 + / "저의 이름은 : " + name + "입니다" 이런식으로 출력값을입력할경우 출력값 : 저의 이름은 : 홍석원입니다.로 출력  		
		System.out.println("저의 이름은 : " + name + "입니다"); // 같이출력을해주는경우에는 + 		
		System.out.println("나이는 : " + age);
		System.out.println("키 : " + height);
		System.out.println("주소 : " + address);
		System.out.println("핸드폰번호 : " + mobile);
	}

}
