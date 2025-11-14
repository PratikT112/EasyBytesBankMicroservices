package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(description = "Name of the customer", example = "Eazy Bytes")
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 40, message =  "The length of customer name should be between 5 and 40 characters")
    private String name;

    @Schema(description = "Email of the customer", example = "EazyBytes@mgail.com")
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email address should be of valid format")
    private String email;

    @Schema(description = "Mobile number of the customer", example = "9472938473")
    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be of 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the customer")
    private AccountsDto accountsDto;
}
