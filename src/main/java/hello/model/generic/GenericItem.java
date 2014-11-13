package hello.model.generic;

import hello.model.generic.relation.LazyRelation;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public abstract class GenericItem<T extends GenericItemType> extends AbstractDocument {
    @Id
    private ObjectId id;
    private String name;
    private Integer weight;
    private LazyRelation<T> type;
    
    public GenericItem(String name, Integer weight, LazyRelation<T> type) {
        super();
        this.id = new ObjectId();
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(
                "%s[name=%s, weight='%d', type='%s']", 
                this.getClass().getSimpleName(), name, weight, type);
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public ObjectId getId() {
        return id;
    }

    public LazyRelation<T> getType() {
        return type;
    }

    
    
}
