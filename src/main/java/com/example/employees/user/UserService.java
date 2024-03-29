package com.example.employees.user;

import com.example.employees.common.service.GenericCrudService;
import com.example.employees.user.dto.UserCreateDto;
import com.example.employees.user.dto.UserPatchDto;
import com.example.employees.user.dto.UserResponseDto;
import com.example.employees.user.dto.UserUpdateDto;
import com.example.employees.user.entity.User1;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Getter
@RequiredArgsConstructor
public class UserService extends GenericCrudService<User1, Long, UserCreateDto, UserUpdateDto, UserPatchDto, UserResponseDto> {

    private final UserRepository repository;
    private final UserDtoMapper mapper;
    private final Class<User1> entityClass = User1.class;
    private final ModelMapper modelMapper;


    @Override
    protected User1 save(UserCreateDto userCreateDto) {
        User1 entity = mapper.toEntity(userCreateDto);
        return repository.save(entity);
    }

    @Override
    protected User1 updateEntity(UserUpdateDto userUpdateDto, User1 user) {
        mapper.update(userUpdateDto, user);
        return repository.save(user);
    }


    public List<User1> getAllUsers() {
        return repository.findAll();
    }

}



