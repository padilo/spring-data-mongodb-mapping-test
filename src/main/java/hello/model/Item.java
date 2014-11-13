package hello.model;

import hello.model.generic.GenericItem;
import hello.model.generic.relation.LazyRelation;

public class Item extends GenericItem<ItemType>{

    public Item(String name, Integer weight, LazyRelation<ItemType> type) {
        super(name, weight, type);
    }


}
