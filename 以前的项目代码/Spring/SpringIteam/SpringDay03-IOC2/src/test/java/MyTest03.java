import com.zlq.model.entity.User;
import com.zlq.model.entity.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void noConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user2");
        user.show();
    }
    @Test
    public void haveConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT usert = (UserT) context.getBean("u3");
        usert.show();
    }
}
