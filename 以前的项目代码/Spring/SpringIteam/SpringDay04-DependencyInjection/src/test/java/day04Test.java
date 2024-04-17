import com.zlq.model.entity.Student;
import com.zlq.model.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class day04Test {
    @Test
    public void TestStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) context.getBean("student");
        student.show();
    }

    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
//        p:命名空间
        User user = context.getBean("user2",User.class);
//        c:命名空间
        User user2 = context.getBean("user2", User.class);
//        System.out.println(user);
        System.err.println(user.hashCode());
        System.err.println(user2.hashCode());
        System.out.println(user==user2);
    }
}
