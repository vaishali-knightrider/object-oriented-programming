package constructorUnderstanding;

public class NumberRunner {
    public static void main(String[] args) {
        Number number = new Number(5 ,10);
        Number n = new Number();
        System.out.println(number.add());
    }
}
