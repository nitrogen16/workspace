
public class Main {

	public static void main(String[] args) {
	
				Person person1 = new Person(); //обращение к классу и создание объекта
				Person person2 = new Person(); //обращение к классу и создание объекта
				
				person1.setName("Малпа");
				person1.setAge(50);
				
				person2.setName("Рыжа Малпа");
				person2.setAge(55);
				
				person1.descriptionOfPerson();
				person2.descriptionOfPerson();
	}

}
