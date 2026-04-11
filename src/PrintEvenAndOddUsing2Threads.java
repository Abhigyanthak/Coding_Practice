public class PrintEvenAndOddUsing2Threads  implements Runnable{

    static  int count = 1;
    Object object;

    public PrintEvenAndOddUsing2Threads(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        while (count < 10){
            if(count % 2 == 0 && Thread.currentThread().getName().equalsIgnoreCase("even")){
                synchronized (object){
                    System.out.println("Thread Name : " + Thread.currentThread().getName() + " value :" + count);
                    count ++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            if(count % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("odd")){
                synchronized (object){
                    System.out.println("Thread Name : " + Thread.currentThread().getName() + " value :" + count);
                    count ++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String args []){
        Object lock = new Object();
        Runnable r1 = new PrintEvenAndOddUsing2Threads(lock);
        Runnable r2 = new PrintEvenAndOddUsing2Threads(lock);

        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();

    }
}
