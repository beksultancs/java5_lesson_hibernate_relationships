package peaksoft.java5.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author Beksultan
 */
@Entity
@Table(name = "books")
@Getter @Setter
@ToString
public class Book {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bigserial
    private Long id;

    private String name;

    private String author;

    private BigDecimal price; // numeric(19, 2)

//    ALL,
//    PERSIST, X
//    MERGE, ✅
//    REMOVE, X
//    REFRESH, X
//    DETACH; X
    @ManyToOne(cascade = CascadeType.MERGE)
    @ToString.Exclude
    private Vendor vendor;

    public Book() {
    }

    public Book(String name, String author, BigDecimal price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
