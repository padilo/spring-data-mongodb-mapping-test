package hello.model.generic;

public abstract class GenericItemType {
    private String description;

    public GenericItemType(String description) {
        super();
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "%s[description=%s]", 
                this.getClass().getSimpleName(), description);
    }
}
