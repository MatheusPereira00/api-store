package com.matheus.apifakestore.Controller;

import com.matheus.apifakestore.model.model_list;
import com.matheus.apifakestore.service.FakeStoreFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")

@CrossOrigin(origins = "http://localhost:4200/")
public class Controller {

    @Autowired
    private FakeStoreFeignClient fakeStoreFeignClient;

    @GetMapping
    public ResponseEntity<model_list> getAllProducts() {
        return ResponseEntity.ok(fakeStoreFeignClient.getAllProducts());
    }
}
