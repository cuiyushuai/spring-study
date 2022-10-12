import com.shuai.dao.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Admin
 * @date 2022/10/12 10:35
 */
public class MyTest {

  @Test
  public void test01() {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService userService = (UserService)context.getBean("userService");

    userService.add();
  }
}
