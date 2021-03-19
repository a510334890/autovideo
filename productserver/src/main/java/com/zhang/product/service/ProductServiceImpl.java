package com.zhang.product.service;

import com.zhang.product.mapper.ProductMapper;
import com.zhang.product.pojo.videoproduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<videoproduct> getproduct() {
        List<videoproduct> getproduct = productMapper.getproduct();

        return getproduct;
    }
}
