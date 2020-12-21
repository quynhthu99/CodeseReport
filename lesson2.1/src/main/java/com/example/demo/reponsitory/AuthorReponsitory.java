package com.example.demo.reponsitory;

import com.example.demo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorReponsitory extends JpaRepository<Author, Integer> {
}
