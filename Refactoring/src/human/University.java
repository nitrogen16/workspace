package human;

import java.util.ArrayList;
import java.util.List;

public class University{
	private String name;
	private int age;
	private List<Student> students = new ArrayList<Student>();

	public University(String name, int age) {
        super();
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        Student result = null;
        for(Student item : students){
        	if(item.getAverageGrade() == averageGrade){
        		result = item;
        	}
        }
    	return result;
    }

    public Student getStudentWithMaxAverageGrade() {
    	 return students.stream().max((s1, s2) -> {return (int)(s1.getAverageGrade() - s2.getAverageGrade());}).get();
    }
    
    public Student getStudentWithMinAverageGrade() {
        Student studentResult = null;
        double min = students.get(0).getAverageGrade();
        for (Student student: students){
            if(student.getAverageGrade() < min){
                min = student.getAverageGrade();
                studentResult = student;
            }
        }
        return studentResult;
    }
    
    public void expel(Student student){
    	if(students.contains(student)){
    		students.remove(student);
    	}
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}