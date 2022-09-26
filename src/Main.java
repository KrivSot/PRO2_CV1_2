import models.ExampleClass;
import models.MyMathClass;

public class Main {

    final int x = 10;
    final double pi = 3.1415920;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ExampleClass exCls = new ExampleClass();

        System.out.println(exCls.x);
        System.out.println(MyMathClass.pi+" "+MyMathClass.sum(2,3));
        //MyMathClass aa = new MyMathClass();

        System.out.print(MyMathClass.InnerClass.x);
    }
}
