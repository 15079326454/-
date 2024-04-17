import com.zlq.model.entity.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01(){
//        获取spring的伤心问对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//对象现在都在spring中管理，要用之久去里面取出来就可以
        Hello hello = (Hello) context.getBean("hello");
        System.err.println(hello.toString());
    }

}
