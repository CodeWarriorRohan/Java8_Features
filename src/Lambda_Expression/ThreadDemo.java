package Lambda_Expression;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable thread1 = () -> {
          for(int i = 0; i <= 10; i++){
              System.out.println("Value of thread is "+i);
              try {
                  Thread.sleep(1000);
              }catch (Exception e){
                  e.printStackTrace();
              }
          }
        };

        Thread t = new Thread(thread1);
       // t.setName("Ram");
        t.start();

        Runnable thread2 = () ->{

            try {
                for (int i = 1; i <= 10; i++){
                    System.out.println(i*2);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread t2 = new Thread(thread2);
       // t2.setName("Ram");
        t2.start();
    }
}
