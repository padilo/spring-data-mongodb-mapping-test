package hello.model.generic.relation;

import hello.model.generic.AbstractDocument;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class EagerRelation<T extends AbstractDocument> extends AbstractDocument {
    @Id
    private ObjectId id;
    @DBRef
    private T content;

    public EagerRelation(T content) {
        this.id = new ObjectId();
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public ObjectId getId() {
        return id;
    }

    public static class Builder {
        @SafeVarargs
        public static <T extends AbstractDocument> List<EagerRelation<T>> of(T... elems) {
            return Stream.<T>of(elems).map(EagerRelation<T>::new).collect(Collectors.toList());
        }
    }
}
