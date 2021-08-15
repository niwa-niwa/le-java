// Thread

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 500; i++){
            System.out.println('*');
        }
    }
}

public class Main5 {
	public static void main(String[] args) {
// 		MyRunnable r = new MyRunnable();
// 		Thread t = new Thread(r);
// 		t.start();
		
		// Lambda式
		new Thread(()->{
		    for (int i=0; i<500; i++){
		        System.out.println("*");
		    }
		}).start();
		
		for (int i = 0; i < 500; i++){
		    System.out.println('_');
		}
	}
}

