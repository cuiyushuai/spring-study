import com.shuai.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Admin
 * @date 2022/10/9 16:01
 */
public class MyTest {
  public static void main(String[] args) {

    //    UserService userService = new UserServiceImpl();
    //
    //    //
    //    ((UserServiceImpl)userService).setUserDao(new UserDaoImol());
    //    userService.getUserList();

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("userServiceImpl");
    userServiceImpl.getUserList();

  }
}
