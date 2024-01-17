package com.zzpzaf.restapidemo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzpzaf.restapidemo.Repositories.UsersRepo;
import com.zzpzaf.restapidemo.dataObjects.UserDTO;

@RestController
public class UsersController {

    @Autowired
    private UsersRepo repo;
    
    @GetMapping(value = "/users")
    public ResponseEntity<List<UserDTO>> getAllIUsers() {

        try {
            return new ResponseEntity<>(repo.getUsers(), HttpStatus.OK);    
        } catch (Exception e) {
            MultiValueMap<String, String> emptyMap = new LinkedMultiValueMap<>();
            return new ResponseEntity<>(emptyMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        
        
    }
}
