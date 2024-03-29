package com.example.employees.user;

import com.example.employees.common.service.GenericDtoMapper;
import com.example.employees.user.dto.UserCreateDto;
import com.example.employees.user.dto.UserResponseDto;
import com.example.employees.user.dto.UserUpdateDto;
import com.example.employees.user.entity.User1;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDtoMapper extends GenericDtoMapper<User1, UserCreateDto, UserUpdateDto, UserResponseDto> {

    private final ModelMapper mapper;

    @Override
    public User1 toEntity(UserCreateDto createDto) {
        return mapper.map(createDto, User1.class);
    }

    @Override
    public UserResponseDto toResponseDto(User1 product) {
        return mapper.map(product, UserResponseDto.class);
    }

    @Override
    public void update(UserUpdateDto updateDto, User1 user) {
        mapper.map(updateDto, user);
    }

    @Override
    public UserCreateDto toCreateDto(User1 user) {
        return null;
    }


}
