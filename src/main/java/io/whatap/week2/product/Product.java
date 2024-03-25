package io.whatap.week2.product;
import jakarta.persistence.*;

@Entity
@Table(name = "products") public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Product(){}
    public Product(String name) {
       this.name = name;
    }
}
