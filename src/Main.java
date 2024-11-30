import essentials.chapter01.Hello;
import essentials.chapter02.VarEx1;
import essentials.chapter02.VarEx2;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 클래스 불러오는 곳
        Hello hello = new Hello();
        VarEx1 varEx1 = new VarEx1();
        VarEx2 varEx2 = new VarEx2();


        // 클래스 실행
        varEx2.init();
    }
}