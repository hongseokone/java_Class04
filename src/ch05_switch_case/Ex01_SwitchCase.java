package ch05_switch_case;

public class Ex01_SwitchCase {
    public static void main(String[] args) {
        int num = 3;
        switch (num) {
            case 0: // num == 0 랑같다.
                System.out.println("num은 0입니다.");
                break;
            case 1: // num == 1 랑같다.
                System.out.println("num은 1입니다.");
                break;
            case 2: // num == 2 랑같다.
                System.out.println("num은 2입니다.");
                break;
            default: // 다 해당 되지 않을때 사용
                System.out.println("1,2,3이 아닙니다.");
                break;
        }
        System.out.println("Switch Case 종료");

        String city = "미국";
        switch (city) {
            case "서울":
                System.out.println("서울입니다.");
                break;
            case "인천":
                System.out.println("인천입니다.");
                break;
            case "제주":
                System.out.println("제주입니다.");
                break;
            default: // 다 해당 되지 않을때 사용
                System.out.println("한국이 아니에요.");
                break;

        }
    }
}
