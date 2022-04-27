package peaksoft.java5.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

    @OneToMany(cascade = {PERSIST, MERGE}, fetch = FetchType.EAGER)
    private List<Book> books;

    public Vendor() {
    }

    public Vendor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void removeBookById(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }
}
