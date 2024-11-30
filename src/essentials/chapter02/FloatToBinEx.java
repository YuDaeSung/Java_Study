package essentials.chapter02;

public class FloatToBinEx {
    public void init() {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i);   // 16진수로 출력
    }
}
