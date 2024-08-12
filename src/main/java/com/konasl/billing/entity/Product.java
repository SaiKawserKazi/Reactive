package com.konasl.billing.entity;

import com.konasl.billing.enums.DomainStatus;
import io.r2dbc.spi.Parameter;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("products")
public class Product {
    @Id
    private Long id;
    private String title;
    private String description;
    private Integer domainStatus;
}


