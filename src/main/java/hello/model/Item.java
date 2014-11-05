package hello.model;

import hello.model.generic.GenericItem;

public class Item extends GenericItem<ItemType>{
    public Item() {
        super();
    }

    public Item(String name, Integer weight, ItemType subType) {
        super(name, weight, subType);
    }


}
