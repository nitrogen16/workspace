package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import kitchen.Dish;

public class ConsoleHelper {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void writeMessage(String message){
		System.out.println(message);
	}
	
	public static String readString() throws IOException{
		return reader.readLine().toString();
	}

	public static List<Dish> getAllDishesForOrder() throws Exception{
        writeMessage("Выберите доступное блюдо или exit для выхода");
        writeMessage(Dish.allDishesToString());
		List<Dish> list = new ArrayList<Dish>();
		while(true){
			String str = reader.readLine();
			if(str.equals("exit")){
				break;
			}
			try{
				list.add(Dish.valueOf(str));
			}catch(IllegalArgumentException e){
				writeMessage(str + " Такого блюда нет!");
			}
		}
		return list;
	}
	
}