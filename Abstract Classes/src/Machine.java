
public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void start();//declaration
	public abstract void doStuff();//declaration
	public abstract void shutDown();//declaration
	
	public void run(){
		start();
		doStuff();
		shutDown();
	}
}
