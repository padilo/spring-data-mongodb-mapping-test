package hello.repositories;

import static org.junit.Assert.assertTrue;
import hello.model.Customer;
import hello.model.Item;
import hello.model.generic.relation.AttributeRelation;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractCustomerTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testFindOne() {
        /*
         * Loads a customer from MongoDB and fails trying to GenericItemType which is abstract,
         * but by Customer class definition it should try to instantiate a ItemType instead.
         */
        Customer c = customerRepository.findOne(1L);

        assertTrue(c.getItems().stream().map(AttributeRelation::getContent).map(Item::getName).anyMatch("Laptop 23A-FZ"::equals));
        
    }

}
