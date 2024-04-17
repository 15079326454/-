import com.zlq.model.dao.Impl.MySqlDaoImpl;
import com.zlq.model.dao.Impl.UserDaoImpl;
import com.zlq.model.service.Impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    public static void main(String[] args) {
//        获取ApplicationContext；拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        容器在手，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
