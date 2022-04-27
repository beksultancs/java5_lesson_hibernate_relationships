package peaksoft.java5.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.java5.config.DatabaseConnection;
import peaksoft.java5.models.Book;
import peaksoft.java5.models.Vendor;

import java.util.List;

/**
 * @author Beksultan
 */
public class BookRepository implements AutoCloseable {

    private final EntityManagerFactory entityManagerFactory = DatabaseConnection.createEntityManagerFactory();


    public void deleteById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.remove(entityManager.find(Book.class, id));

//        entityManager.createQuery("delete from Book b where b.id = ?1")
//                .setParameter(1, id)
//                .executeUpdate();

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public void save(Book newBook) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(newBook);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public void merge(Book newBook) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.merge(newBook);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public Book findById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Book book = entityManager.find(Book.class, id);

        entityManager.getTransaction().commit();

        entityManager.close();

        return book;
    }

    public List<Book> findAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        List<Book> books = entityManager.createQuery("select b from Book b", Book.class).getResultList();

        entityManager.getTransaction().commit();

        entityManager.close();

        return books;
    }

    @Override
    public void close() throws Exception {
        entityManagerFactory.close();
    }
}
