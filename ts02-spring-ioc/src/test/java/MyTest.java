import com.shuai.bean.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Admin
 * @date 2022/10/9 17:06
 */
public class MyTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    Hello hello = (Hello)context.getBean("hello");
    System.out.println(hello.toString());

  }
}
