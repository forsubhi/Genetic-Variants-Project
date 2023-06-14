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
        String file = ResourceReader.readResourceFile("A.sql");
        String result = executeQueries(file);
        return result;
    }

    public String testQueriesB() {
        String file = ResourceReader.readResourceFile("B.sql");
        String result = executeQueries(file);
        return result;
    }

    public String testQueriesC() {
        String file = ResourceReader.readResourceFile("C.sql");
        String result = executeQueries(file);
        return result;
    }

    public String testQueriesD() {
        String file = ResourceReader.readResourceFile("D.sql");
        String result = executeQueries(file);
        return result;
    }

    private String executeQueries(String file) {
        String result = "";
        String[] queries = file.split("\n");
        ArrayList<Long> results = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            log.info("start with query number " + i);
            long periodSum = 0;
            for (int j = 0; j < 3; j++) {
                log.info("start with query number " + i + " j=" + j);
                String query = queries[i];
                long start = System.currentTimeMillis();
                Integer integer = variantRepository.executeNativeQuery(query);
                // log.info("result size is = "+integer);
                long end = System.currentTimeMillis();
                periodSum += end - start;
            }
            long period = periodSum / 3;
            results.add(period);
            result += period + "<br>";
        }

        double min = Collections.min(results);
        result += "min= " + min + "\n";
        log.info("min= " + min);
        double max = Collections.max(results);
        result += "max= " + max + "\n";
        log.info("max= " + max);

        int sum = results.stream().mapToInt(Long::intValue).sum();
        result += "average= " + sum / queries.length + "\n";
        log.info("average= " + sum / queries.length);

        double median = Quantiles.median().compute(results);
        result += "median= " + median + "\n";
        return result;
    }
}
