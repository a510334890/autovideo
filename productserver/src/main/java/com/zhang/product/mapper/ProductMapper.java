package com.zhang.product.mapper;

import com.zhang.product.pojo.videoproduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ProductMapper {
    List<videoproduct> getproduct();
}
