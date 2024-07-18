package Method_Refrences;

import java.time.LocalDate;

public class Referenced_Method {
    public static void reference(){
        System.out.println("This is the method call of referenced method class !");

        LocalDate date = LocalDate.now();
        System.out.println("Today's Date : "+date);
    }

    public  static void threadClass(){
        for (int i = 1; i<= 10; i++){
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    // Non static method

    public void prinyNumbers(){
        for (int i = 1; i<= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
