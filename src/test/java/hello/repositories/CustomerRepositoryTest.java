package hello.repositories;

import hello.Application;
import hello.MongoEmbeddedConfiguration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {MongoEmbeddedConfiguration.class, Application.class})
public class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testFindOne() {
        /*
         * This generates call loads a customer from MongoDB and fails trying to GenericItemType which is abstract,
         * but by Customer class definition it should try to instantiate a ItemType instead  
         */
        customerRepository.findOne(1L);        
    }

}
