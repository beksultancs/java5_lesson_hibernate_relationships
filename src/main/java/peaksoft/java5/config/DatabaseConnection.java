package peaksoft.java5.config;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.java5.models.Book;
import peaksoft.java5.models.Vendor;

import java.util.Properties;

/**
 * @author Beksultan
 */
public class DatabaseConnection {

    public static EntityManagerFactory createEntityManagerFactory() {
        Properties properties = new Properties();
        properties.setProperty(Environment.DRIVER, "org.postgresql.Driver");
        properties.setProperty(Environment.URL, "jdbc:postgresql://localhost:5678/postgres");
//        properties.setProperty(Environment.USER, "postgres");
//        properties.setProperty(Environment.PASS, "postgres");

        properties.setProperty(Environment.HBM2DDL_AUTO, "update");
        properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty(Environment.SHOW_SQL, "true");

        Configuration configuration = new Configuration();

        configuration.setProperties(properties);

        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(Vendor.class);

        return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
    }
}
