package com.example.demo.reponsitory;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReponsitory extends JpaRepository<Book, Integer> {

}
