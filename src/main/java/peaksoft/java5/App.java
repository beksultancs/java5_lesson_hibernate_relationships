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

        bookRepository.deleteById(5L);


//        Vendor vendor = vendorRepository.findById(1L);

//        System.out.println("\u001B[35m " + vendor + "\u001B[35m");

//        Book book = new Book(
//                "wpoertiu",
//                "pwoeriut",
//                BigDecimal.valueOf(2300)
//        );
//
//        vendor.addBook(book);
//        book.setVendor(vendor);
////
//        vendorRepository.merge(vendor);
//
//        Book book = bookRepository.findById(1L);
//
//        vendor.addBook(book);
//
//        book.setVendor(vendor);
//
//        vendorRepository.merge(vendor);


//        Vendor aichurok = new Vendor(
//                "Aichurok",
//                "aichurok@gmail.com"
//        );
//
//        Book book = new Book(
//                "asdfasdf",
//                "asdfasdfasd",
//                BigDecimal.valueOf(1300)
//        );
//
//        aichurok.addBook(book);
//        book.setVendor(aichurok);
//
//        vendorRepository.save(aichurok);
//        bookRepository.save(new Book(
//                "asdfawef",
//                "asdfasdf",
//                BigDecimal.valueOf(1200)
//        ));

        bookRepository.close();
        vendorRepository.close();

    }
}
