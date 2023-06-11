package com.database.project.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

public class CustomVariantRepositoryImpl implements CustomVariantRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Integer executeNativeQuery(String query) {
        Query nativeQuery = entityManager.createNativeQuery(query);
        List resultList = nativeQuery.getResultList();
        return resultList.size();
    }
}
