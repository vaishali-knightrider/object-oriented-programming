package constructorUnderstanding;

public class Number {
    private int a;
    private int b;

//    non parametrized constructor (default constructor)
    public Number() {
    }

//    parametrized constructor
    public Number(int a,int b)
    {
        this(); // calling non parametrized constructor
        this.a = a;
        this.b = b;
        System.out.println("Object created");
    }

//    instance member method
    public void printNumbers()
    {
        System.out.println("a - "+this.a + " , b - " +this.b);
    }

//    instance member method
    public int add()
    {
        this.printNumbers(); // method chaining in java using "this"
        return this.a+this.b;
    }
}
