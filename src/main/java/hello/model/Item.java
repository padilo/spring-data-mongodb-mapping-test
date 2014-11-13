package hello.model;

import hello.model.generic.GenericItem;
import hello.model.generic.relation.EagerRelation;

public class Item extends GenericItem<ItemType>{

    public Item(String name, Integer weight, EagerRelation<ItemType> type) {
        super(name, weight, type);
    }


}
