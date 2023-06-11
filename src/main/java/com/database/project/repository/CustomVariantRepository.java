package com.database.project.repository;

import com.database.project.model.Variant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomVariantRepository  {


    Integer executeNativeQuery(String query);
}