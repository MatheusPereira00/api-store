package com.matheus.apifakestore.service;

import com.matheus.apifakestore.model.model_list;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@Component
@FeignClient(name = "Store-Api", url = "https://fakestoreapi.com/products")
public interface FakeStoreFeignClient {
    @GetMapping
    model_list getAllProducts();
}
