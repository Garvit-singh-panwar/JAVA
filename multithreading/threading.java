
package multithreading;

class ThreadingThings extends Thread {

    int threadno;

    ThreadingThings(int i){
        this.threadno = i;
    }

@Override
  public void run(){
    
    for(int i = 1 ; i <= 5 ; i++){
    System.out.println(i + " from thread " + threadno );
        try{
          Thread.sleep(1000);
        }
        catch(InterruptedException e){

        }
    }
  }
}

public class threading {
    public static void main(String[] args){
        
        
        ThreadingThings things = new ThreadingThings(0);
        ThreadingThings things1 = new ThreadingThings(1);
        ThreadingThings things2 = new ThreadingThings(2); 

        things.start();
        things1.start();
        things2.start();
    }
}

