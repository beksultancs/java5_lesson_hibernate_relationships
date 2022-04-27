package peaksoft.java5;

import peaksoft.java5.models.Book;
import peaksoft.java5.models.Vendor;
import peaksoft.java5.repositories.BookRepository;
import peaksoft.java5.repositories.VendorRepository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {
        BookRepository bookRepository = new BookRepository();
        VendorRepository vendorRepository = new VendorRepository();


        bookRepository.deleteById(4L);

//        Book book = bookRepository.findById(4L);

//        Vendor vendor = vendorRepository.findById(1L);
//        System.out.println(vendor);
//
//        vendor.setBook(book);
//
//        vendorRepository.update(vendor);

//        Vendor vendor = vendorRepository.findById(1L);
//
//        Book book1 = new Book(
//                "451C",
//                "Kunzaada Bekzhanova",
//                BigDecimal.valueOf(1200)
//        );

//        bookRepository.save(book1);
//        vendor.setBook(book1);
//
//        vendorRepository.update(vendor);

//        Vendor vendor = new Vendor("Chynara", "chynara@gmail.com");
//
//        Book book1 = new Book(
//                "Becoming",
//                "Mishel Obama",
//                BigDecimal.valueOf(2000)
//        );
//        Book book2 = new Book(
//                "Educated",
//                "Tara Westover",
//                BigDecimal.valueOf(1400)
//        );
//        vendor.setBooks(List.of(book1, book2));
//        vendorRepository.save(vendor);


//        Book book = new Book(
//                "Toolor Kulaganda",
//                "Chyngyz Aitmatov",
//                BigDecimal.valueOf(1000)
//        );
//
//        bookRepository.save(book);

//        bookRepository.findAll().forEach(System.out::println);

        bookRepository.close();
        vendorRepository.close();
    }
}
