package essentials.chapter02;

import java.util.*;

public class ScannerEx {
    public void init() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수를 하나 입력해 주세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :" + input);
        System.out.printf("num=%d%n", num);
    }
}