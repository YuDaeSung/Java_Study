package essentials.chapter02;

public class CastingEx3 {
    public void init() {
        float  f  = 9.1234567f;
        double d  = 9.1234567;
        double d2 = (double) f;

        System.out.printf("f  = %20.18f\n", f);
        System.out.printf("d  = %20.18f\n", d);
        System.out.printf("d2 = %20.18f\n", d2);
    }
}
