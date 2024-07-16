package Lambda_Expression;

public class Main {
    public static void main(String[] args) {
        System.out.println("System Starts..");

        // 1. create a separate class and implements this interface

        Functional_Interface type1 = new Functional_Interface_Impl();
        type1.home();

        // 2. create a anonymous class for implementing this interface

        Functional_Interface type2 = new Functional_Interface() {
            @Override
            public void home() {
                System.out.println("This is implementation of functional interface by creating anonymous class in main method");
            }
        };
        type2.home();

        // 3. using  Lambda Expression
        // This Lambda Expression can be use only when the interface is FunctionalInterface
        // Rule 1: If there is only one statement in lambda then we can write it without {parenthesis}

        Functional_Interface type3 = () -> System.out.println("This is implementation of functional interface by creating lambda expression(method) in main method");
        type3.home();


// Sum interface using Lambda Expression


        Sum_Interface Sum = (int a, int b) ->{
            return a+b;
        };

        // or
        // Rule 2: there is no need to define data types in lambda expression

        // Sum_Interface Sum = (a, b) ->  a+b;

        System.out.println("Sum is "+Sum.sum(17,5));
        System.out.println("Sum is "+Sum.sum(7,12));

// String Length interface using Lambda Expression

        String_Length lengthInter = str -> str.length();

        System.out.println("String length is "+lengthInter.getLengh("Java Eight Features Lambda Expression"));
    }
}