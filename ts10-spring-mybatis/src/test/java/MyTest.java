import com.shuai.bean.User;
import com.shuai.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @author Admin
 * @date 2022/10/12 11:41
 */
public class MyTest {
  @Test
  public void test01() throws IOException {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
    List<User> userList = userMapper.getUserList();
    for (User user : userList) {
      System.out.println(user);

    }
  }
}
