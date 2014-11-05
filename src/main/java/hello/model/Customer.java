package hello.model;

import java.util.List;

import hello.model.generic.GenericCustomer;

public class Customer extends GenericCustomer<Item>{

    public Customer() {
        super();
    }

    public Customer(Long id, String firstName, String lastName, List<Item> items) {
        super(id, firstName, lastName, items);
    }

}
