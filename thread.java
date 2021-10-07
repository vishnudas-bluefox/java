class mythread extends Thread{
	String tname;
	mythread(String name){
		super(name);
		tname=name;
		System.out.println("created "+name);
		start();
	}
	public void run(){
		try{
			if(tname=="one"){
				for(int i=0;i<=10;i++){
					System.out.println("Hello");
					Thread.sleep(1000);
				}
			}
			if(tname=="two"){
				for(int i=0;i<=10;i++){
					System.out.println("World");
					Thread.sleep(300);
				}
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
class Main{
	public static void main(String[] args){
		new mythread("one");
		new mythread("two");
	}
}
