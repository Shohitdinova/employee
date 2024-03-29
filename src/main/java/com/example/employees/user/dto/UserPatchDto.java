package com.example.employees.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPatchDto {

    private Long id;

    @NotBlank
    private String name;

    private String email;

    @NotBlank
    private String address;

    @NotBlank
    private String phoneNumber;


}
