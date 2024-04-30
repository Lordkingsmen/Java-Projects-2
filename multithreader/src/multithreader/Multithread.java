package multithreader;


//Java code for thread creation by extending
//the Thread class
class MultithreadingDemo extends Thread
{
 public void run()
 {
     try
     {

     }
     catch (Exception e)
     {
         System.out.println("Exception is caught");
     }
 }
}

//Main Class
public class Multithread
{
 public static void main(String[] args)
 {
     int n = 8; // Number of threads
     for (int i = 0; i < n; i++) {
         MultithreadingDemo object
             = new MultithreadingDemo();
         object.start();
     }
 }
}