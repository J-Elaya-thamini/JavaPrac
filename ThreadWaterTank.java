package www.java.firstproject;

import java.util.concurrent.atomic.AtomicInteger;
class Inlet extends Thread{
	public void run() {
		while(true) {
			int current = ThreadWaterTank.level.get();
			if(current < 50) {
				ThreadWaterTank.level.addAndGet(current+5);
				System.out.println("Adding water "+ThreadWaterTank.level.get());
			}
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
class Outlet extends Thread{
	public void run() {
		while(true) {
			int current = ThreadWaterTank.level.get();
			if(current>80) {
				ThreadWaterTank.level.addAndGet(-10);
				System.out.println("Emptying tank "+ThreadWaterTank.level.get());
			}
			try {
				Thread.sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
	
}
class Controller extends Thread{
	public void run() {
		while(true) {
			int level = ThreadWaterTank.level.get();
			System.out.println("Controller: Current level = "+level);
		}
		/*try{
			Thread.sleep();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
	}
}

public class ThreadWaterTank {
	static AtomicInteger level = new AtomicInteger(50);
	static final int max_cap = 100;
	public static void main(String[] args) {
		Inlet inlet = new Inlet();
		Outlet outlet = new Outlet();
		Controller control = new Controller();
		
		inlet.start();
		outlet.start();
		control.start();
	}
}
