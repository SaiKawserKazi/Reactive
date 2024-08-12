package com.konasl.billing.entity;

import com.konasl.billing.enums.DomainStatus;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("services")
public class Service {
    @Id
    private Long id;
    private Long productId;
    private String title;
    private String description;
    private DomainStatus domainStatus;
}

