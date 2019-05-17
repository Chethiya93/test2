package com.virtusa.groupfour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.groupfour.modal.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>
{

}
