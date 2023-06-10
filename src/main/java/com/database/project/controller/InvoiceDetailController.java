package com.database.project.controller;

import com.database.project.model.InvoiceDetail;
import com.database.project.model.InvoiceDetailForInsert;
import com.database.project.model.Tutorial;
import com.database.project.repository.InvoiceDetailRepository;
import com.database.project.repository.InvoiceDetailRepositoryForInsert;
import com.database.project.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/invoice-details")
public class InvoiceDetailController {

    @Autowired
    InvoiceDetailRepository invoiceDetailRepository;

    @Autowired
    InvoiceDetailRepositoryForInsert invoiceDetailRepositoryForInsert;

    @GetMapping("/sample")
    public ResponseEntity<List<InvoiceDetail>> getAllTutorials(@RequestParam(required = false) String title) {
        try {
            ArrayList invoiceDetails = new ArrayList<>();
            invoiceDetailRepository.findAll(Pageable.ofSize(10)).forEach(invoiceDetails::add);
            return new ResponseEntity<>(invoiceDetails, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestParam(required = false) String title) {

        ArrayList<InvoiceDetailForInsert> invoiceDetails = new ArrayList();
        try {
            for (int i = 0; i < 3; i++) {
                InvoiceDetailForInsert invoiceDetailForInsert = new InvoiceDetailForInsert();
                invoiceDetailForInsert.setId(UUID.randomUUID().toString());
                invoiceDetailForInsert.setInvoiceDate(LocalDateTime.now());
                invoiceDetailForInsert.setInvoiceNo(String.valueOf(i + 100));
                invoiceDetailForInsert.setCountry("Test");
                invoiceDetailForInsert.setDescription("Test Desc");
                invoiceDetailForInsert.setQuantity(10);
                invoiceDetailForInsert.setCustomerID(2020);
                invoiceDetailForInsert.setUnitPrice(100F);
                invoiceDetailForInsert.setStockCode("5202");
                invoiceDetails.add(invoiceDetailForInsert);
            }

            invoiceDetailRepositoryForInsert.saveAll(invoiceDetails);

            return new ResponseEntity<>("Done", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/query")
    public ResponseEntity<List<InvoiceDetail>> query() {
        try {
            List<InvoiceDetail> invoiceDetails = invoiceDetailRepository.findByCustomerID("18074");
            return new ResponseEntity<>(invoiceDetails, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}