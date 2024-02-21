package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.ReservedBooks;

@Repository
public interface ReservedBookRepository extends JpaRepository<ReservedBooks,Integer> {

}