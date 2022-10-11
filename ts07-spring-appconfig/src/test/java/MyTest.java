import com.shuai.bean.User;
import com.shuai.config.ShuaiConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Admin
 * @date 2022/10/11 13:45
 */
public class MyTest {
  @Test
  public void Test01() {
    ApplicationContext context = new AnnotationConfigApplicationContext(ShuaiConfig.class);
    User user = context.getBean("user", User.class);
    System.out.println(user.getName());
  }
}
