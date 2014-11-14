package hello.model.generic;

import hello.model.Relation;


public abstract class AbstractItem<T> {
    private Relation<T> type;

    public AbstractItem(Relation<T> type) {
        super();
        this.type = type;
    }

    public Relation<T> getType() {
        return type;
    }

    
    
}
