package Exersice;



public class TwoThreads1task {
	public static void main(String[] args) {
		Canon bofors=new Canon();
		ShootingTask st=new ShootingTask(bofors);
		
		Thread naina=new Thread(st,"Filler ");
		Thread shabeer=new Thread(st,"Shooter");
		
		Filler.start();
		Shooter.start();
	}
}
class ShootingTask implements Runnable{
	Canon gun;
	public ShootingTask(Canon gun) {
		this.gun=gun;
	}
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("Filler")) {
			for(int i=0;i<5;i++) {
				gun.fill();
			}
		}
		else if(t.getName().equals("Shooter")) {
			for(int i=0;i<5;i++) {
				gun.shoot();
			}
		}
	}
}
class Canon{
	boolean flag;
	synchronized public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(flag) {
			try {wait();}
			catch
				(Exception e){
			}
		}
		System.out.println(name+" fills the gun.......");
		flag = true;
		notify();
	}
	
	synchronized public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!flag) {
			try {wait();}
			catch
				(Exception e){
			}
		}
		System.out.println(name+" Shoots the gun");
		flag = false;
		notify();	}
}