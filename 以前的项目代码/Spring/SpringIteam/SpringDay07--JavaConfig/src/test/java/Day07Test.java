import com.zlq.config.UserConfig;
import com.zlq.model.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Day07Test {
    @Test
    public void Test01() {
//        如果完全使用了配置类方式做，我们就只能通过ApplicationContext上下文来获取容器，
//        通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
