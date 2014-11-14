package hello.model.generic;

import hello.model.Relation;


public abstract class AbstractCustomer<C> {
    private Relation<C> item;

    public AbstractCustomer(Relation<C> item) {
        super();
        this.item = item;
    }

    public Relation<C> getItem() {
        return item;
    }

    
}
