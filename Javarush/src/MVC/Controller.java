package MVC;

public class Controller {
	private StudentModel student;
	private View view;
	
	public String getStudentName() {
		return student.getName();
	}
	
	public void setStudentName(String name) {
		student.setName(name);
	}
	
	public String getStudentLesson() {
		return student.getLesson();
	}
	
	public void setStudentLesson(String lesson) {
		student.setLesson(lesson);
	}

	public Controller(StudentModel student, View view) {
		this.student = student;
		this.view = view;
	}
	
	public void updateView() {
		view.printStudents(student.getName(), student.getLesson());
	}
	
}
