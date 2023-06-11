package com.database.project.service;

import com.database.project.repository.VariantRepository;
import com.database.project.utils.ResourceReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VariantService {

    @Autowired
    VariantRepository variantRepository;

    public Integer testQueriesA() {
        String file = ResourceReader.readResourceFile("A.sql");
        String[] queries = file.split("\n");
        ArrayList<Long> results = new ArrayList<>();
        for (String query : queries) {
            long start = System.currentTimeMillis();
            variantRepository.executeNativeQuery(query);
            long end = System.currentTimeMillis();
            long period = end - start;
            results.add(period);
        }

        int sum = results.stream().mapToInt(Long::intValue).sum();
        return sum;
    }
}
