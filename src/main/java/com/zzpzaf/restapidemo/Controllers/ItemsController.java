package com.zzpzaf.restapidemo.Controllers;

import java.util.List;

import com.zzpzaf.restapidemo.Repositories.ItemsRepo;
import com.zzpzaf.restapidemo.dataObjects.ItemDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class ItemsController {

    @Autowired
    private ItemsRepo repo;

    @GetMapping(value = "/items")
    public ResponseEntity<List<ItemDTO>> getItems() {

        try {
            return new ResponseEntity<>(repo.getItems(), HttpStatus.OK);    
        } catch (Exception e) {
            MultiValueMap<String, String> emptyMap = new LinkedMultiValueMap<>();
            return new ResponseEntity<>(emptyMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    @GetMapping(value = "/freeitems")
    public ResponseEntity<List<ItemDTO>> getFreetems() {

        try {
            return new ResponseEntity<>(repo.getItems(), HttpStatus.OK);    
        } catch (Exception e) {
            MultiValueMap<String, String> emptyMap = new LinkedMultiValueMap<>();
            return new ResponseEntity<>(emptyMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    
}
