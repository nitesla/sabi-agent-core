package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private Bank bank;
    private Cordinates cordinates;
    private String createdAt;
    private DeliveryAddress deliveryAddress;
    private String deliveryInstruction;
    private String deliveryNote;
    private String email;
    private HomeAddress homeAddress;
    private String id;
    private String name;
    private List<String> notes;
    private OfficeAddress officeAddress;
    private String phoneNumber;
    private String phoneNumber2;
    private List<SaleReference> saleReferences ;
    private List<ShopReference> shopReferences ;
    private String status;
    private List<Transaction> transactions;
    private String updatedAt;
}
