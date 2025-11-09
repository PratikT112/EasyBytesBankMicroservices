package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity{
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Id
    @Column(name = "ACCOUNT_NUMBER")
    private Long accountNumber;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "BRANCH_ADDRESS")
    private String branchAddress;
}
