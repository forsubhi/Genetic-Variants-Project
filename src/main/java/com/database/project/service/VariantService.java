package com.database.project.service;

import com.database.project.repository.VariantRepository;
import com.database.project.utils.ResourceReader;
import com.google.common.math.Quantiles;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Service
@Log
public class VariantService {

    @Autowired
    VariantRepository variantRepository;

    public String testQueriesA() {
        String result = "";
        String file = ResourceReader.readResourceFile("A.sql");
        String[] queries = file.split("\n");
        ArrayList<Long> results = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            log.info("start with query number " + i);
            String query = queries[i];
            long start = System.currentTimeMillis();
            variantRepository.executeNativeQuery(query);
            long end = System.currentTimeMillis();
            long period = end - start;
            results.add(period);
            result += period + "\n";
        }

        int sum = results.stream().mapToInt(Long::intValue).sum();
        result += "average= " + sum / queries.length + "\n";
        log.info("average= " + sum / queries.length );
        double min = Collections.min(results);
        result += "min= " + min + "\n";
        log.info("min= " + min);
        double max = Collections.max(results);
        result += "max= " + max + "\n";
        log.info( "max= " + max);
        double median = Quantiles.median().compute(results);
        result += "median= " + median + "\n";
        return result;
    }
}
