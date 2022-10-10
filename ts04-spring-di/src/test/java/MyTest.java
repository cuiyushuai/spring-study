import com.shuai.bean.Student;
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
}
