package hello;

import hello.model.Customer;
import hello.model.Item;
import hello.model.ItemType;
import hello.model.generic.relation.AttributeRelation;
import hello.model.generic.relation.EagerRelation;
import hello.repositories.CustomerRepository;
import hello.repositories.ItemRepository;
import hello.repositories.ItemTypeRepository;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;
    @Autowired
    private ItemRepository itemRepo;
    @Autowired
    private ItemTypeRepository itemTypeRepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        Customer customer = new Customer(1L, "Alice", "Smith",
                AttributeRelation.Builder.of(
                        new Item("Laptop 23A-FZ", 42, new EagerRelation<ItemType>(new ItemType("Laptops"))),
                        new Item("TV 55' A22-P", 69, new EagerRelation<ItemType>(new ItemType("TV")))
                        )
                );
        
        repository.save(customer).getItems().stream()
                .map(AttributeRelation::getContent)
                .map(itemRepo::save)
                .map(Item::getType)
                .map(EagerRelation::getContent)
                .forEach(itemTypeRepo::save);
                
        repository.save(new Customer(2L, "Bob", "Smith", Collections.<AttributeRelation<Item>> emptyList()));


    }

}
