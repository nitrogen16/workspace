package MVC;

public class Main {

	public static void main(String[] args) {
		StudentModel model = new StudentModel();
		model.setName("John");
		model.setLesson("Java");
		
		View view = new View();
		
		Controller con = new Controller(model, view);
		con.updateView();
		model.setName("Jimmy");
		model.setLesson("HHHH");
		con.updateView();
	}

}
