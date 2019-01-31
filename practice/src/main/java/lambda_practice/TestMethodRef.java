package lambda_practice;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 实例方法引用、构造方法引用
 *
 * @author wangjiangtao
 * @date 2019/01/31
 **/
public class TestMethodRef {

    @Test
    public void test1(){
        Consumer<String> con1 = (x) -> System.out.println("123");

        Consumer<String> con2 = System.out::println;
        con2.accept("123");
    }

    @Test
    public void test2(){
        Object ob = new Object();
        Supplier<String> supplier = () -> ob.toString();
        System.out.println(supplier.get());

        Supplier<String> supplier1 = ob::toString;
        System.out.println(supplier1.get());
    }

    @Test
    public void test3(){
        Comparator<Integer> comparator = (x,y) -> Integer.compare(x,y);
        Comparator<Integer> comparator2 = Integer::compareTo;
        comparator.compare(1,2);
        comparator2.compare(1,2);

    }
}
