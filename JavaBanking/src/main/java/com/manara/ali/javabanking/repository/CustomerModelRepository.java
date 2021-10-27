package com.manara.ali.javabanking.repository;

import com.manara.ali.javabanking.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerModelRepository extends JpaRepository<CustomerModel, Integer> {
}
