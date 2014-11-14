package hello.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Relation<T> {
    @Id
    private ObjectId id;
    @DBRef
    private T content;

    public Relation(T content) {
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
        public static <T> List<Relation<T>> of(T... elems) {
            return Stream.<T>of(elems).map(Relation<T>::new).collect(Collectors.toList());
        }
    }
}
