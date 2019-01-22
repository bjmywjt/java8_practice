package lambda_practice;

/**
 * @author wangjiangtao
 * @date 2019/01/22
 **/
public interface MyFunction<T,R> {

    public R handle(T t1, T t2);
}
