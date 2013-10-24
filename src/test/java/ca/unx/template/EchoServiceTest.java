package ca.unx.template;

import ca.unx.template.EchoService;
import config.RootConfiguration;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * A sample test.  Seems a bit heavyweight though, as it creates a full
 * application context.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfiguration.class,
        loader = AnnotationConfigContextLoader.class)
public class EchoServiceTest {

    @Autowired
    private EchoService echoService;

    @Test
    public void testEcho() {
        Assert.assertEquals("echo", echoService.echo("echo"));
    }
}
