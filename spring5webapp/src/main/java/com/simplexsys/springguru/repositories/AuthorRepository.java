package com.simplexsys.springguru.repositories;

import org.springframework.data.repository.*;

import com.simplexsys.springguru.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
