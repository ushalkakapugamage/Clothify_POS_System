package org.example.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Supplier {
    private String supplierName;
    private String product;
    private String category;
    private  Double buyingPrice;
    private int contactNumber;
    private String email;
    private String company;
    private String branch;
}
