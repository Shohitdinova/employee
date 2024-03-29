package com.example.employees.user;
import com.example.employees.user.entity.User1;
import org.apache.catalina.User;
import org.springframework.ui.Model;

import com.example.employees.user.dto.UserCreateDto;
import com.example.employees.user.dto.UserResponseDto;
import com.example.employees.user.dto.UserUpdateDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<UserResponseDto> create(@RequestBody @Valid UserCreateDto createDto) {
        UserResponseDto categoryResponseDto = service.create(createDto);
        return ResponseEntity.ok(categoryResponseDto);
    }
    @GetMapping
    public ResponseEntity<Page<UserResponseDto>> getAll(Pageable pageable, @RequestParam(required = false) String predicate) {
        Page<UserResponseDto> all = service.getAll(pageable, predicate);
        return ResponseEntity.ok(all);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> get(@PathVariable Long id) {
        UserResponseDto responseDto = service.getById(id);
        return ResponseEntity.ok(responseDto);
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDto> update(@PathVariable Long id, @RequestBody @Valid UserUpdateDto updateDto) {
        UserResponseDto responseDto = service.update(id, updateDto);
        return ResponseEntity.ok(responseDto);
    }





//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long id) {
//        service.delete(id);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//
@GetMapping("/users")
public String getAllUsers(Model model) {
    List<User1> users = service.getAllUsers();
    model.addAttribute("users", users);
    return "users";
}

}
