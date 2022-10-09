import com.shuai.dao.UserDaoImol;
import com.shuai.service.UserService;
import com.shuai.service.UserServiceImpl;

/**
 * @author Admin
 * @date 2022/10/9 16:01
 */
public class MyTest {
  public static void main(String[] args) {

    UserService userService = new UserServiceImpl();

    //  
    ((UserServiceImpl)userService).setUserDao(new UserDaoImol());
    userService.getUserList();
  }
}
