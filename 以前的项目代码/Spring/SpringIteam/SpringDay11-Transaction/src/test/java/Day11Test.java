import com.zlq.model.dao.UserMapper;
import com.zlq.model.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day11Test {
    @Test
    public void testSelect(){
     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        for (User user : mapper.selectUser()) {
            System.err.println(user);
        }
    }


    @Test
    public void addUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        User user = new User(11, "sdfs", "234234", "jiad", "5454654");
        mapper.addUser(user);
        mapper.deleteUser(11);

    }
}
