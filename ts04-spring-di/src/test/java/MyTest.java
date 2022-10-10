import com.shuai.bean.Student;
import com.shuai.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Admin
 * @date 2022/10/10 11:38
 */
public class MyTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Student student = (Student)context.getBean("student");
    System.out.println(student);
  }

  @Test
  public void Test04() {
    ApplicationContext context = new ClassPathXmlApplicationContext("userApplicationContext.xml");
    User user = context.getBean("user", User.class);
    User user2 = context.getBean("user2", User.class);
    System.out.println(user == user2);

  }
}
