package hello.repositories;

import hello.Application;
import hello.configuration.embedded.MongoEmbeddedConfiguration;
import hello.configuration.typed.MongoNonTypedConfiguration;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {MongoNonTypedConfiguration.class, MongoEmbeddedConfiguration.class, Application.class})
public class CustomerNonTypedRepositoryTest extends AbstractCustomerTest {
}
