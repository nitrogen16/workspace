import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writing objects...");
		
		Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob"), new Person(100500, "Igar")};
		
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		try /*(FileOutputStream fs = new FileOutputStream("people.bin"); ObjectOutputStream os = new ObjectOutputStream(fs))*/
		(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))){
			
			os.writeObject(people);
			
			os.writeObject(peopleList);
			
			os.writeInt(peopleList.size());
			
			for (Person person: peopleList){
				os.writeObject(person);
				System.out.println("Writing a " + person);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
