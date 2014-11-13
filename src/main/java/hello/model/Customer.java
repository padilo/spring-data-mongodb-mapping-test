package hello.model;

import hello.model.generic.GenericCustomer;
import hello.model.generic.relation.AttributeRelation;

import java.util.List;

public class Customer extends GenericCustomer<Item>{

    public Customer() {
        super();
    }

    public Customer(Long id, String firstName, String lastName, List<AttributeRelation<Item>> items) {
        super(id, firstName, lastName, items);
    }


    
}
