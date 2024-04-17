import com.zlq.model.entity.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day05Test {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Autowired.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
