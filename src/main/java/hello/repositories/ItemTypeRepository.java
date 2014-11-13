package hello.repositories;

import hello.model.ItemType;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemTypeRepository extends MongoRepository<ItemType, String> {

}
