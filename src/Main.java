import models.*;
import models.dataSaver.DataSaver;
import models.dataSaver.FileDataSaver;
import models.dataSaver.MemoryDataSaver;

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
        Box<ExampleClass> box = new Box<>(exCls);
        Box<String> boxString = new Box<>("Ahoj");
        Box<Integer> boxInt = new Box<>(2);
        Pair<Integer, String> myPair = new Pair<>(1, "Praha");
        Pair<Integer, String> myPair2 = new Pair<>(2, "Hradec K.");
        Car car1 = new Car("Skoda", "Fabia");

        boolean condToFile = false;

        DataSaver<Integer> mySaver;
        if(condToFile){
            mySaver = new FileDataSaver<>();
        }
        else{
            mySaver = new MemoryDataSaver<>();
        }

        mySaver.save(20);
        System.out.println(mySaver.load());
        printStar(5);

        try {

        }
        catch (Exception e){

        }
    }

    private static void printStar(int x){
        if(x < 1) return;
        System.out.println("*");
        x = x-1;
        printStar(x);
    }
}
