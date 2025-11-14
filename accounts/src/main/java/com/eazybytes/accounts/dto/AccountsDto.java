package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountsDto {

    @Schema(
            description = "Account number of Eazy Bank Account"
    )
    @NotEmpty(message = "AccountNumber cannot be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(description = "Account type of Eazy Bank Account", example = "savings")
    @NotEmpty(message = "AccountType cannot be a null or empty")
    private String accountType;

    @Schema(description = "Branch Address of Eazy Bank Branch", example = "savings")
    @NotEmpty(message = "BranchAddress cannot be a null or empty")
    private String branchAddress;
}
