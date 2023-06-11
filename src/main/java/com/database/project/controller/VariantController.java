package com.database.project.controller;

import com.database.project.model.Variant;
import com.database.project.repository.VariantRepository;
import com.database.project.service.VariantService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;


@RestController
@RequestMapping("/variant")
@Log
public class VariantController {

    @Autowired
    VariantService variantService;

    @Autowired
    VariantRepository variantRepository;

    @GetMapping("/sample")
    public ResponseEntity<List<Variant>> getSample() {
        try {
            log.info("Test");
            ArrayList products = new ArrayList<>();
            variantRepository.findAll(Pageable.ofSize(10)).forEach(products::add);

            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/test")
    public ResponseEntity<String> test() {
        try {
            String results = variantService.testQueriesA();

            return new ResponseEntity<>(results, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}