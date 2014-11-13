package hello.model.generic;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public abstract class GenericItemType extends AbstractDocument {
    @Id
    private ObjectId id;
    private String description;

    public GenericItemType(String description) {
        super();
        this.id = new ObjectId();
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "%s[description=%s]", 
                this.getClass().getSimpleName(), description);
    }

    public ObjectId getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
}
