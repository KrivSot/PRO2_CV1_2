package models;

public class MyMathClass {
    public final static float pi = 3.14f;

    private MyMathClass(){}
    public static int sum(int a, int b){
        return a + b;
    }

    public class InnerClass{
        public static int x = 16;
    }
}
