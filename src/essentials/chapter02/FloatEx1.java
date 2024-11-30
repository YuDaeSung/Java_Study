package essentials.chapter02;

public class FloatEx1 {
    public void init() {
        float  f  = 9.12345678901234567890f;
        float  f2 = 1.2345678901234567890f;
        double d  = 9.12345678901234567890d;

        System.out.printf("     12345678901234\n");
        System.out.printf("f   : %f%n", f); // 소수점 이하 6째자리까지 출력.
        System.out.printf("f   : %24.20f%n", f);
        System.out.printf("f   : %24.20f%n", f2);
        System.out.printf("f   : %24.20f%n", d);
    }
}
