package lambda_practice;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 四大内置核心函数式接口
 *
 * @author wangjiangtao
 * @date 2019/01/22
 **/

public class BuiltInFunctionalInterface {

    @Test
    public void test1(){
        happy(500.00, (x) -> System.out.println("happy消费了："+ x + "元。"));
    }

    @Test
    public void test2(){
        afford(() -> (int)(Math.random()*100));
    }

    @Test
    public void test3(){
        handle("abcdEfg", (str) -> str.toUpperCase());
    }

    @Test
    public void test4(){
        validate("将计就计", (str) -> !str.isEmpty());
    }

    /**
     * 消费型测试方法
     *
     * @param fee
     * @param con
     */
    public void happy(Double fee, Consumer<Double> con){
        con.accept(fee);
    }

    /**
     * 供给型方法
     *
     * @param supplier
     * @return
     */
    public void afford(Supplier<Integer> supplier){
        Integer result = supplier.get();
        System.out.println(result);
    }

    /**
     * 函数型方法
     *
     * @param str
     * @param function
     */
    public void handle(String str, Function<String, String> function){
        System.out.println(function.apply(str));
    }

    /**
     * 断言型方法
     *
     * @param str
     * @param predicate
     */
    public void validate(String str, Predicate<String> predicate){
        String result = predicate.test(str) ? "通过了" : "没通过";
        System.out.println(result);
    }
}
