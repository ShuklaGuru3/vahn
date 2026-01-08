package org.example.vahn.service;

import lombok.extern.slf4j.Slf4j;
import org.example.vahn.dto.VahnGenericResponse;
import org.example.vahn.model.User;
import org.example.vahn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public VahnGenericResponse<Object> addUser(String name) {
        try {
            userRepository.save(User.builder().name(name).build());
            return VahnGenericResponse.ok(null, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Something went wrong while adding user");
            return null;
        }
    }

}
