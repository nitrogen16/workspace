package main;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

//Конвертация объекта в JSON
public class Solution {
	public static void main(String[] args) throws IOException {
		Cat cat = new Cat();
		cat.name = "Murka";
		cat.age = 5;

		Dog dog = new Dog();
		dog.name = "Killer";
		dog.age = 8;
		dog.owner = "Bill Jeferson";

		House house = new House();
		house.pets.add(dog);
		house.pets.add(cat);

		StringWriter writer = new StringWriter();
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(writer, house);
		System.out.println(writer.toString());
	}
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({ @JsonSubTypes.Type(value = Cat.class, name = "cat"),
		@JsonSubTypes.Type(value = Dog.class, name = "dog") })
class Pet {
	public String name;
}

class Cat extends Pet {
	public int age;
}

class Dog extends Pet {
	public int age;
	public String owner;
}

class House {
	public List<Pet> pets = new ArrayList<Pet>();
}
