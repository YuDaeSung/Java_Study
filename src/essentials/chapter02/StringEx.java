package essentials.chapter02;

public class StringEx {
    public void init() {
        String name = "Ja" + "va";
        String str  = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + ""); // 14 예상
        System.out.println("" + 7 + 7);
    }
}
