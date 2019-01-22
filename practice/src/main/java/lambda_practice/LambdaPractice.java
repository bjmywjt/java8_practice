package lambda_practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda练习
 *
 * @author wangjiangtao
 * @date 2019/01/22
 **/
public class LambdaPractice {


    /**
     *
     *
     */
    @Test
    public void test1(){
        List<Employee> lists = new ArrayList<Employee>();
        lists.add(new Employee("wjt", 30));
        lists.add(new Employee("zs", 30));
        lists.add(new Employee("wmy", 6));
        Collections.sort(lists, (e1, e2) -> e1.getAge().compareTo(e2.getAge()));
        Collections.sort(lists, Comparator.comparing(Employee::getAge));
    }

    @Test
    public void test2(){
        String r1 = handleStr("abcdefg", str -> str.toUpperCase());
        System.out.println(r1);
    }

    @Test
    public void test3(){
        doHandle2L(1l,2l, (x, y) -> x + y );

        doHandle2L(1l,2l, (x, y) -> x * y );
    }

    public void doHandle2L(long l1, long l2, MyFunction<Long, Long> function){
        Long r1 = function.handle(l1, l2);
        System.out.println(r1.longValue());
    }

    public String handleStr(String str, StrHandler strHandler){
        return strHandler.handler(str);
    }

    class Employee{
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Employee(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
