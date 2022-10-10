import com.shuai.bean.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Admin
 * @date 2022/10/10 14:54
 */
public class MyTest {
  @Test
  public void Test01() {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    People people = context.getBean("people", People.class);
    people.getCat();
    people.getDog();
  }

}
