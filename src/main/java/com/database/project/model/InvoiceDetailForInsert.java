package com.database.project.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
public class InvoiceDetailForInsert {

    @Id
    @Column
    @JsonIgnore
    private String id;

    @Column(name = "invoiceno")
    private String invoiceNo;
    @Column(name = "stockcode")
    private String stockCode;
    @Column
    private String description;
    @Column
    private Integer quantity;
    @Column(name = "invoicedate")
    private LocalDateTime invoiceDate;
    @Column(name = "unitprice")
    private Float unitPrice;
    @Column(name = "customerid")
    private Integer customerID;
    @Column
    private String country;
    @Column(name = "itemtotal")
    private Float itemTotal;
}
