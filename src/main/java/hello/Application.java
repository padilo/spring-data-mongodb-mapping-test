package hello;

import hello.model.Customer;
import hello.model.Item;
import hello.model.ItemType;
import hello.model.Relation;
import hello.repositories.CustomerRepository;
import hello.repositories.ItemRepository;
import hello.repositories.ItemTypeRepository;

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

        Customer customer = new Customer(1L, "Alice",
                new Relation<Item>(
                        new Item(1L, "TV 55' A22-P", new Relation<ItemType>(new ItemType(1L, "TV")))
                ));
        
        itemTypeRepo.save(itemRepo.save(repository.save(customer).getItem().getContent()).getType().getContent());

    }

}
