package male;

import main.AbstractFactory;
import main.Human;

public class MaleFactory implements AbstractFactory{
	
	public Human getPerson(int age){
		if(age <= KidBoy.MAX_AGE){
			return new KidBoy();
		}else if(age > KidBoy.MAX_AGE && age <= TeenBoy.MAX_AGE){
			return new TeenBoy();
		}else{
			return new Man();
		}
	}
}
