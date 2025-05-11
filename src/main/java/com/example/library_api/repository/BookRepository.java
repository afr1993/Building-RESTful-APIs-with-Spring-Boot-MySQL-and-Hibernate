package com.example.library_api.repository;
import com.example.library_api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // You can define custom query methods here if needed
    // Example: Optional<Book> findByIsbn(String isbn);
}