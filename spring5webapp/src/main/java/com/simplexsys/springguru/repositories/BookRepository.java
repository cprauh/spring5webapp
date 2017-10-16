package com.simplexsys.springguru.repositories;

import org.springframework.data.repository.CrudRepository;

import com.simplexsys.springguru.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
}
