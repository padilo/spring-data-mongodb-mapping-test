package hello.model.generic;

public abstract class GenericItem<T extends GenericItemType> {
    private String name;
    private Integer weight;
    private T subType;

    public GenericItem() {
        super();
    }

    public GenericItem(String name, Integer weight, T subType) {
        super();
        this.name = name;
        this.weight = weight;
        this.subType = subType;
    }

    @Override
    public String toString() {
        return String.format(
                "%s[name=%s, weight='%d', subType='%s']", 
                this.getClass().getSimpleName(), name, weight, subType);
    }

}
