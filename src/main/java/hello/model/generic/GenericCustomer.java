package hello.model.generic;

import java.util.List;

import org.springframework.data.annotation.Id;


public abstract class GenericCustomer<T extends GenericItem<?>> {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    
    private List<T> items;

    public GenericCustomer() {}

    public GenericCustomer(Long id, String firstName, String lastName, List<T> items) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.items = items;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(
                "%s[id=%d, firstName='%s', lastName='%s', items='%s']", 
                this.getClass().getSimpleName(), id, firstName, lastName, items);
    }
    

}

