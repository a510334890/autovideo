package com.zhang.product.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class videoproduct implements Serializable {
    private int pid;
    private BigDecimal pname;
    private String price;
    private String cid;
    private int num;

}
