package lambda_practice;

import org.junit.Test;

import java.util.function.Consumer;

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

    /**
     * 消费型测试方法
     *
     * @param fee
     * @param con
     */
    public void happy(Double fee, Consumer<Double> con){
        con.accept(fee);
    }
}
