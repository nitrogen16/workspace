package findClassByDescription;

import java.util.concurrent.ConcurrentSkipListMap;

/* 
Найти класс по описанию
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        Class c = ConcurrentSkipListMap.class;
        return c;
    }
}
