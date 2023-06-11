package com.database.project.repository;

import com.database.project.model.Variant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VariantRepository extends JpaRepository<Variant, Long>, CustomVariantRepository {

}