package peaksoft.java5.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

/**
 * @author Beksultan
 */
@Entity
@Table(name = "vendors")
@Getter @Setter
@ToString
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @OneToMany(cascade = ALL, mappedBy = "vendor")
    private List<Book> books = new ArrayList<>();

    public Vendor() {
    }

    public Vendor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Long id) {
        this.books.removeIf(book -> book.getId().equals(id));
    }
}
