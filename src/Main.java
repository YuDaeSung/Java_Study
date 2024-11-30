import essentials.chapter01.Hello;
import essentials.chapter02.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // Chapter 1
//        Hello hello = new Hello();

        // Chapter 2
//        VarEx1 varEx1 = new VarEx1(); VarEx2 varEx2 = new VarEx2(); StringEx stringEx = new StringEx();
//        PrintfEx1 printEx1 = new PrintfEx1(); PrintfEx2 printEx2 = new PrintfEx2(); ScannerEx scannerEx = new ScannerEx();
//        CharToCode charToCode = new CharToCode(); SpecialCharEx specialCharEx = new SpecialCharEx(); OverflowEx overflowEx = new OverflowEx();
//        FloatEx1 floatEx1 = new FloatEx1(); FloatToBinEx floatToBinEx = new FloatToBinEx(); CastingEx1 castingEx1 = new CastingEx1();
        CastingEx2 castingEx2 = new CastingEx2(); CastingEx3 castingEx3 = new CastingEx3(); CastingEx4 castingEx4 = new CastingEx4();

        // 클래스 실행
        castingEx4.init();


        // 테스트용
        System.out.println("\n\n\n\n\n\n\nTEST===============================================================================================================================");

        int i = 50000;
        byte b = (byte) i;

        System.out.println(b);
    }
}