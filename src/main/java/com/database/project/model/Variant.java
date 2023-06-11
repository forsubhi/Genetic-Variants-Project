package com.database.project.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "variants",schema = "public")
@Getter
@Setter
public class Variant {

    @Id
    @JsonIgnore
    private Integer id;

    private Integer PositionStart;

    private Integer Length;

    private String Reference;

    private String Alternative;

    private String Type;

    private String GeneName;

    private String ClinicalSignificance;

    private String Disease;

    private String Synonimity;

    private String GeneRegion;

    private Integer Chromosome;

}
