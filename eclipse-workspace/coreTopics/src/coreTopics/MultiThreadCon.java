package coreTopics;

public class MultiThreadCon  extends Thread{
	public void run()
	{
		for (int i=0;i<=10;i++)
		{Thread.yield();
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("sudheer");
		System.out.println(Thread.currentThread().getName());
		
		MultiThreadCon mt =new MultiThreadCon();
		Thread t =new Thread(mt);
		t.setPriority(MAX_PRIORITY);;
		mt.start();
		for(int i =0;i<=10;i++)
			
		{
			System.out.println("main thread");
		}
	}

}
