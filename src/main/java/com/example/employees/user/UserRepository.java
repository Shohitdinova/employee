package com.example.employees.user;

import com.example.employees.common.repository.GenericSpecificationRepository;
import com.example.employees.user.entity.User1;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends GenericSpecificationRepository<User1, Long> {

}
