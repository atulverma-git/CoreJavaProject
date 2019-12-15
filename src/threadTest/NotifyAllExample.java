package threadTest;


/*
 * Caution : this program logically right but syntactically wrong. 
 * Do not use "synchronized" keyword in run method of Thread.
 * Correct approach in written in RevisionProject -> com.thread2.ThreadSequenceImpl
 */

public class NotifyAllExample {

    volatile int status=1;
    public static void main(String[] args) {

        NotifyAllExample notifyAllExample = new NotifyAllExample();

        A1 a=new A1(notifyAllExample);
        B1 b=new B1(notifyAllExample);
        C1 c=new C1(notifyAllExample);

        a.start();
        b.start();
        c.start();
    }
}

class A1 extends Thread{
    NotifyAllExample notifyAllExample;

    A1(NotifyAllExample notifyAllExample){
        this.notifyAllExample = notifyAllExample;
    }

    @Override
    public void run() {

        try{
            synchronized (notifyAllExample) {

                for (int i = 0; i < 10; i++) {

                    while(notifyAllExample.status!=1){
                        notifyAllExample.wait();
                    }

                    System.out.println("A ");
                    notifyAllExample.status = 2;
                    notifyAllExample.notifyAll();
                }

            }
        }catch (Exception e) {
            System.out.println("Exception 1 :"+e.getMessage());
        }

    }

}

class B1 extends Thread{

    NotifyAllExample notifyAllExample;

    B1(NotifyAllExample notifyAllExample){
        this.notifyAllExample = notifyAllExample;
    }

    @Override
    public void run() {

        try{
            synchronized (notifyAllExample) {

                for (int i = 0; i < 10; i++) {

                	while(notifyAllExample.status!=2){
                        notifyAllExample.wait();
                    }

                    System.out.println("B ");
                    notifyAllExample.status = 3;
                    notifyAllExample.notifyAll();
                }

            }
        }catch (Exception e) {
            System.out.println("Exception 2 :"+e.getMessage());
        }

    }
}


class C1 extends Thread{

    NotifyAllExample notifyAllExample;

    C1(NotifyAllExample notifyAllExample){
        this.notifyAllExample = notifyAllExample;
    }

    @Override
    public void run() {

        try{
            synchronized (notifyAllExample) {

                for (int i = 0; i < 10; i++) {

                	while(notifyAllExample.status!=3){
                        notifyAllExample.wait();
                    }

                    System.out.println("C ");
                    notifyAllExample.status = 1;
                    notifyAllExample.notifyAll();
                }

            }
        }catch (Exception e) {
            System.out.println("Exception 3 :"+e.getMessage());
        }

    }
}

