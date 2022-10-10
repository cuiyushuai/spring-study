import com.shuai.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Admin
 * @date 2022/10/10 17:10
 */
public class MyTest {

  @Test
  public void Test01() {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    User user = context.getBean("user", User.class);
    System.out.println(user.getName());
  }

}
