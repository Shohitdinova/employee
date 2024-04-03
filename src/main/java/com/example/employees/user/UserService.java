package com.example.employees.user;
import com.example.user_crud_html.user.dto.UserResponseDto;
import com.example.user_crud_html.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper mapper;


    public List<UserResponseDto> getAll() {

        List<User> all = userRepository.findAll();
        return all.stream()
                .map(book -> mapper.map(book, UserResponseDto.class))
                .collect(Collectors.toList());


    }





    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    public User add(User book) {
        return userRepository.save(book);
    }


    public void update(Long id, User updatedBook) {
        if (userRepository.existsById(id)) {
            updatedBook.setId(id);
            userRepository.save(updatedBook);
        }
    }


    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
