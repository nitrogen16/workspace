package otherexmaple;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

public class Solution {

	public static void main(String[] args) throws JAXBException {
		// создание объектов Cat&Zoo для сериализации в XML
		Cat cat = new Cat();
		cat.name = "Murka";
		cat.age = 5;
		cat.weight = 4;

		Zoo zoo = new Zoo();
		zoo.animals.add(cat);
		zoo.animals.add(cat);

		// писать результат сериализации будем во Writer(StringWriter)
		StringWriter writer = new StringWriter();

		// создание объекта Marshaller, который выполняет сериализацию
		JAXBContext context = JAXBContext.newInstance(Cat.class, Zoo.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		// самосериализация
		marshaller.marshal(zoo, writer);

		// преобразовываем все записанное в StringWriter в строку
		System.out.println(writer.toString());
	}

}

@XmlType(name = "zoo")
@XmlRootElement
class Zoo {
	@XmlElementWrapper(name="wild-animals", nillable = true)
 public List animals = new ArrayList();
}

@XmlType(name = "tiger")
class Cat {
	@XmlElement(name = "catname")
	public String name;
	@XmlAttribute(name = "age")
	public int age;
	@XmlAttribute(name = "w")
	public int weight;

	Cat() {
	}
}
