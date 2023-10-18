package org.example.dao;


import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

@Entity

public class SupplierEntity extends RecursiveTreeObject<SupplierEntity> {
    @Id
    private int id;

    private String supplierName;
    private String product;
    private String category;
    private  Double buyingPrice;
    private int contactNumber;
    private String email;
    private String company;
    private String branch;


}
