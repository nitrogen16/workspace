class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("I can jump up to " + height + " meters!");
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving to " + direction + " Metres in direction: " + distance);
	}
}



public class App {

	public static void main(String[] args) {
		Robot sam = new Robot();

		sam.speak("Hi! I am Sam");
		sam.jump(25);
		sam.move("South.", 2500.54688756);
		
		String greeting = "Hi there!!!!!";
		sam.speak(greeting);
		
		int value = 14;
		sam.jump(value);
	}

}
