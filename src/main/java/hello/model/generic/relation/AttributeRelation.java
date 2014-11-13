package hello.model.generic.relation;

import hello.model.generic.AbstractDocument;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AttributeRelation<T extends AbstractDocument> extends LazyRelation<T> {

    private Map<String, String> attributes;

    public AttributeRelation(T content) {
        super(content);
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public static class Builder {
        @SafeVarargs
        public static <T extends AbstractDocument> List<AttributeRelation<T>> of(T... elems) {
            return Stream.<T>of(elems).map(AttributeRelation<T>::new).collect(Collectors.toList());
        }
    }
}
