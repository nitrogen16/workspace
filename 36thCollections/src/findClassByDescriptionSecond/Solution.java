package findClassByDescriptionSecond;

import java.util.concurrent.SynchronousQueue;

/* 
Найти класс по описанию
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        Class c = SynchronousQueue.class;
        return c;
    }
}