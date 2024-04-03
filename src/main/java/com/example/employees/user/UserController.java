package com.example.employees.user;

import com.example.employees.user.dto.UserResponseDto;
import com.example.employees.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping
    public List<UserResponseDto> getAll() {
        return userService.getAll();
    }



    @PostMapping
    public ResponseEntity<User> add(@RequestBody User book) {
        User bookResponseDto = userService.add(book);
        return  ResponseEntity.status( HttpStatus.CREATED).body(bookResponseDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody User updatedBook) {
        userService.update(id, updatedBook);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
