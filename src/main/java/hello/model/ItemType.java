package hello.model;

import org.springframework.data.annotation.Id;

public class ItemType {
    @Id
    private Long id;
    private String description;

    public ItemType(Long id,String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
