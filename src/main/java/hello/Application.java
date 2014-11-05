package hello;

import hello.model.Customer;
import hello.model.Item;
import hello.model.ItemType;
import hello.model.generic.GenericCustomer;
import hello.repositories.CustomerRepository;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new Customer(1L, "Alice", "Smith",
                Arrays.asList(
                        new Item("Laptop 23A-FZ", 34, new ItemType("Laptops")),
                        new Item("TV 55' A22-P", 34, new ItemType("TV"))
                        )
                ));
        repository.save(new Customer(2L, "Bob", "Smith", Collections.<Item> emptyList()));


    }

}
