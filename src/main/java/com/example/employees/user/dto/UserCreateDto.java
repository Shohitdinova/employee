package com.example.employees.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreateDto {


    @NotBlank
    private String name;

    private String email;

    @NotBlank
    private String address;

    @NotBlank
    private String phoneNumber;





}
