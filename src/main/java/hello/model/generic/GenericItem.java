package hello.model.generic;

import hello.model.generic.relation.EagerRelation;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public abstract class GenericItem<T extends GenericItemType> extends AbstractDocument {
    @Id
    private ObjectId id;
    private String name;
    private Integer weight;
    private EagerRelation<T> type;
    
    public GenericItem(String name, Integer weight, EagerRelation<T> type) {
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

    public EagerRelation<T> getType() {
        return type;
    }

    
    
}
