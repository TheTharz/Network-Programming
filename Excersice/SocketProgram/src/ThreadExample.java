class TextThread implements Runnable{
  public void run(){
    for(int i=0;i<5;i++){
      System.out.println("Text");
    }
  }
}

class HelloThread implements Runnable{
  public void run(){
    for(int i=0;i<5;i++){
      System.out.println("Hello");
    }
  }
}

public class ThreadExample {
    public static void main(String[] args) {

      //create new runnable objects
      TextThread textTask = new TextThread();
      HelloThread helloTask = new HelloThread();

      //create new threads
      Thread textThread = new Thread(textTask); 
      Thread helloThread = new Thread(helloTask);

      textThread.start();
      helloThread.start();

      try {
        textThread.join();
        helloThread.join();
      } catch (Exception e) {
        System.out.println(e);
      }

      System.out.println("Main Thread");
    }
}