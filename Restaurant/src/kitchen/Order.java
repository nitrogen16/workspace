package kitchen;

import java.util.List;

import main.ConsoleHelper;
import main.Tablet;

public class Order {
	private final Tablet tablet;
	protected List<Dish> dishes;
	
	public Order(Tablet tablet) throws Exception {
		this.tablet = tablet;
		this.dishes = ConsoleHelper.getAllDishesForOrder();
	}

	@Override
	public String toString() {
		if(dishes.isEmpty()){
			return "";
		}else{
			return "Your order: " + dishes.toString() + " of "+ tablet + ", cooking time " + getTotalCookingTime() + "min";
		}
	}
	
	public int getTotalCookingTime(){
		int orderDuration = 0;
		for(Dish item : dishes){
			orderDuration += item.getDuration();
		}
		return orderDuration;
	}
	
	public boolean isEmpty(){
		if(dishes.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

	public List<Dish> getDishes() {
		return dishes;
	}
	
}
