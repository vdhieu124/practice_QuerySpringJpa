package com.multicampus.vuongduyhieu_queryjpa.repository;

import com.multicampus.vuongduyhieu_queryjpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
