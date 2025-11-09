package com.eazybytes.accounts.entity;


import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(name = "NAME")
    private String name;

    private String email;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
}
