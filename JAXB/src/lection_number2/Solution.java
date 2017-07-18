package lection_number2;

import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

public class Solution {

	public static void main(String[] args) throws JAXBException {
		String xmldata = "<zoo><cat/><cat/><dog/><cat/></zoo>";
		StringReader reader = new StringReader(xmldata);
		JAXBContext context = JAXBContext.newInstance(Cat.class, Zoo.class, Dog.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Zoo zoo = (Zoo) unmarshaller.unmarshal(reader);
		for(Object item : zoo.animals){
			System.out.println(item.getClass().getSimpleName());
		}
		System.out.println(zoo.animals);
	}
}

@XmlType(name = "zoo")
@XmlRootElement
class Zoo {
	@XmlAnyElement
	public List<Object> animals;
}

@XmlType(name = "cat")
@XmlRootElement
class Cat {
	public String name;
	public int age;
	public int weight;

	Cat() {
	}
}

@XmlType(name = "dog")
@XmlRootElement
class Dog {
	public String name;
	public int age;
	public int weight;

	Dog(){
	}
}
