package programmers.lessons;

public class ToString {
    static String name;
    static int number;

    public static void main(String[] args) {
        name = "Car";
        number = 1234;

        ToString t = new ToString();

        System.out.print(t.toString());
    }

    //toString을 오버라이드 해 보세요.
    //return 형식은 아래줄을 참고하세요:
    //"name: " + name + ", number: " + number;
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("name: ");
        sb.append(name);
        sb.append(", number: ");
        sb.append(number);

        return sb.toString();
    }
}
