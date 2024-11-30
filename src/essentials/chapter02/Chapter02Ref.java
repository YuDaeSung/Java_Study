package essentials.chapter02;

public class Chapter02Ref {
    public void init() {
        //final int MAX_SPEED = 10;  // 상수 선언 및 초기화
        final int MAX_SPEED;
        MAX_SPEED = 100;

        System.out.println("상수 MAX_SPEED = " + MAX_SPEED + " JDK 1.6부터 상수를 선언과 동시에 초기화 하지 않아도 되지만, 상수는 선언과 동시에 초기화하는 습관을 들이는게 좋다.");

        int octNum = 010;   //  8진수 10, 10진수로 8
        int hexNum = 0x10;  // 16진수 10, 10진수로 16
        int binNum = 0b10;  //  2진수 10, 10진수로 2

        float pi    = 3.14f;    // f가 생략되면 3.14는 double로 간주되므로 에러가 발생된다.
        double rate = 1.618d;   // 접미사 d는 생략이 가능
    }
}
