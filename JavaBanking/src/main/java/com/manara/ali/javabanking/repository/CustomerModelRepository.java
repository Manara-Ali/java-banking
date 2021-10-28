package com.manara.ali.javabanking.repository;

import com.manara.ali.javabanking.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerModelRepository extends JpaRepository<CustomerModel, Integer> {
    List<CustomerModel> findByUsername(String username);
}
