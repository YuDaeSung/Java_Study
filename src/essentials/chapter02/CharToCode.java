package essentials.chapter02;

public class CharToCode {
    public void init() {
        char  ch = 'A';  // char ch = 65;
        int code = (int) ch;

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch);
    }
}
