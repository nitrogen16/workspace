package proxy;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution.getProxy(Item.class));                        //true false false
        test(solution.getProxy(Item.class, Small.class));           //true false true
        test(solution.getProxy(Item.class, Big.class, Small.class));//true true true
        test(solution.getProxy(Big.class, Small.class));            //true true true т.к. Big наследуется от Item
        test(solution.getProxy(Big.class));                         //true true false т.к. Big наследуется от Item
    }


    @SuppressWarnings("unchecked")
	public <T extends Item> T getProxy(Class<T> mainClass, Class ... otherClasses){
        ClassLoader classLoader = mainClass.getClassLoader();
        ItemInvocationHandler invocationHandler = new ItemInvocationHandler();
        List<Class> classList = new ArrayList<>();
        classList.add(mainClass);
        classList.addAll(Arrays.asList(otherClasses));
        Class<?>[] allClasses = new Class[otherClasses.length+1];
        allClasses[0] = mainClass;
        for (int i = 0; i < otherClasses.length; i++) {
            allClasses[i+1] = otherClasses[i];
        }
        return (T) Proxy.newProxyInstance(classLoader, allClasses, invocationHandler);
    }



	private static void test(Object proxy) {
        boolean isItem = proxy instanceof Item;
        boolean isBig = proxy instanceof Big;
        boolean isSmall = proxy instanceof Small;

        System.out.format("%b %b %b\n", isItem, isBig, isSmall);
    }
    
}