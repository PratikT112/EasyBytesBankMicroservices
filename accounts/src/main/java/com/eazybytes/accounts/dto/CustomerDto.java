package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 40, message =  "The length of customer name should be between 5 and 40 characters")
    private String name;

    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email address should be of valid format")
    private String email;

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be of 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
