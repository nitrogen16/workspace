class BankAccount{
	private int balance = 100;
	public int getBalance(){
		return balance;
	}
	public void withdraw(int amount){
		balance = balance - amount;
	}
}

public class RyanAndMonicaJob implements Runnable{
	private BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();
	}
	@Override
	public void run() {
		for(int x = 0; x < 10; x++){
			makeWithdrawl(10);
			if(account.getBalance() < 0){
				System.out.println("Limit is exceeded!!!!");
			}
		}
	}
	
	private synchronized void makeWithdrawl(int amount){
		if(account.getBalance() >= amount){
			System.out.println(Thread.currentThread().getName() + " is going to withdraw money");
			try{
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(500);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is awaking");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " is finishing withdraw process " + account.getBalance() + "$");
		}
		else{
			System.out.println("Sorry! For " + Thread.currentThread().getName() + " client it's not enough cash on amount");
		}
	}

}
