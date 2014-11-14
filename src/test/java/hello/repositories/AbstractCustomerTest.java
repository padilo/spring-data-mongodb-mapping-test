package hello.repositories;

import static org.junit.Assert.assertEquals;
import hello.model.Customer;
import hello.model.Item;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractCustomerTest {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void testFindOne() {
        /*
         * Loads a customer from MongoDB and fails trying to GenericItemType which is abstract,
         * but by Customer class definition it should try to instantiate a ItemType instead.
         */
        Customer c = customerRepository.findOne(1L);

        assertEquals("TV", c.getItem().getContent().getType().getContent().getDescription());
    }

    @Test
    public void testFindOneItem() {
        /*
         * Loads a customer from MongoDB and fails trying to GenericItemType which is abstract,
         * but by Customer class definition it should try to instantiate a ItemType instead.
         */
        Item i = itemRepository.findAll().get(0);

        assertEquals("TV", i.getType().getContent().getDescription());
    }

}
