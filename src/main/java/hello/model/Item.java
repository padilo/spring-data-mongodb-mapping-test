package hello.model;

import hello.model.generic.AbstractItem;

import org.springframework.data.annotation.Id;

public class Item extends AbstractItem<ItemType> {
    @Id
    private Long id;
    private String name;
    
    public Item(Long id, String name, Relation<ItemType> type) {
        super(type);
        this.id = id;
        this.name = name;
    }

     public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

}
