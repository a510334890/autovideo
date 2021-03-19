package com.zhang.product.controller;

import com.zhang.product.service.FignRest;
import com.zhang.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private FignRest fignRest;
    @RequestMapping("/getproduct")
    public List getProduct(){
        return productService.getproduct();
    }
    @RequestMapping("/getuser")
    public List getuser(){
        return fignRest.getuser();
    }
}
