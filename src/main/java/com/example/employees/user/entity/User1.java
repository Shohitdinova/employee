package com.example.employees.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "`user`")
public class User1 {
    @Id
    private Long chatId;
    private String firstname;
    private String lastname;
    private String username;
    private String phoneNumber;


    public User1(Long chatId, String firstname, String lastname, String username) {
        this.chatId = chatId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
    }
}
