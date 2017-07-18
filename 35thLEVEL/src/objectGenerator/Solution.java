package objectGenerator;

/* 
Генератор объектов
*/
public class Solution {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
    	Generator<Event> eventGenerator = new Generator<>(Event.class);

        System.out.println(eventGenerator.newInstance().getId());
        System.out.println(eventGenerator.newInstance().getId());
        System.out.println(eventGenerator.newInstance().getId());
        
        Class<Integer> clazz1 = Integer.class;
        System.out.println(clazz1);
        
        Class clazz = Integer.class;
        System.out.println(clazz);
        
        
        Class<? extends String> clazz2 = "abc".getClass();
        System.out.println(clazz2);
    }

}
