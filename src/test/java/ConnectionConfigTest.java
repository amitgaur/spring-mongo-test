import com.amitgaur.sample.app.config.ConnectionConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/2/13
 * Time: 1:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionConfigTest {

   @Test
   public void testConfigContext(){

    ApplicationContext ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);


    ConnectionConfig config = ctx.getBean(ConnectionConfig.class);

       Assert.assertNotNull(config);


    }
}
