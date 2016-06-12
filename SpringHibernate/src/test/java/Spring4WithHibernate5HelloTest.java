import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ange on 2016/6/6.
 */
public class Spring4WithHibernate5HelloTest {

    @Test
    public void testName() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sf = context.getBean("localSessionFactoryBean", SessionFactory.class);
        System.out.println(sf);
    }
}
