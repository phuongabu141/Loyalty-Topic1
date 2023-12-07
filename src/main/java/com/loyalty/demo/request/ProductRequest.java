package com.loyalty.demo.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductRequest {

    private String name;

    private Long price;
}
