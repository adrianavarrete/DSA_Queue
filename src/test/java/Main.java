import org.junit.Assert;
import org.junit.Test;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

private final static Logger log = Logger.getLogger(Main.class);

    @Test
    public void testPushPop(){

        BasicConfigurator.configure();


        QueueImp<Integer> cola = new QueueImp(10);

        log.info("paso por aquí");
        cola.push(6);
        log.error("añadido");

        Assert.assertEquals(1,cola.size());



    }
}
