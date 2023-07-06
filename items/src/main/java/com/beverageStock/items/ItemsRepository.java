package com.beverageStock.items;

import Model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemsRepository extends MongoRepository<Item,Integer> {

    //Item findItemByItemID (String iID);
}
