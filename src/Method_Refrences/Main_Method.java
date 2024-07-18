package Method_Refrences;

public class Main_Method {
    public static void main(String[] args) {
        System.out.println("method reference..");

        // 1. implementation of Functional Interface

        Functional_Interface funInter = ()->{
            System.out.println("This is Functional Interface Calling -> doTask()");
        };

        funInter.doTask();

        // 2. Here we are not give new implementations
        // We Refer the previously written method " reference() " in the class Referenced_Method

        // Here we refer the static method
        // ClassName::methodName;

        Functional_Interface funInter1 = Referenced_Method::reference;
        funInter1.doTask();

        // Using Thread Class

        Runnable runnable = Referenced_Method::threadClass;
        Thread th = new Thread(runnable);
        th.start();

        // Instance Method Reference

        // Non static method refer -> printNumbers()
        // To refer non static method we need the object of class
        // Object::methodName;

        Referenced_Method ref = new Referenced_Method();
        Runnable runnable1 = ref::prinyNumbers;
        Thread th1 = new Thread(runnable1);
        th1.start();
    }
}
