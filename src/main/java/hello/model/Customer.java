package hello.model;

import hello.model.generic.AbstractCustomer;

import org.springframework.data.annotation.Id;

public class Customer extends AbstractCustomer<Item> {
    @Id
    private Long id;
    private String name;

    public Customer(Long id, String name, Relation<Item> item) {
        super(item);
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
