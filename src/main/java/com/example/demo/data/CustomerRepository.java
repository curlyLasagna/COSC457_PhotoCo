package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
//    @Query("select c from Customer c " +
//            "where lower(c.fName) like lower(concat('%', :searchTerm, '%')) " +
//            "or lower(c.lName) like lower(concat('%', :searchTerm, '%'))")
//    List<Customer> search(@Param("searchTerm") String searchTerm);
}
