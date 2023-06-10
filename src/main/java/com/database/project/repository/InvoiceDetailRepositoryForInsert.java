package com.database.project.repository;

import com.database.project.model.InvoiceDetailForInsert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDetailRepositoryForInsert extends JpaRepository<InvoiceDetailForInsert, String> {

}