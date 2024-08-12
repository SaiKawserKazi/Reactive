package com.konasl.billing.entity;

import com.konasl.billing.enums.DomainStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Builder
@Table("packages")
public class Package {
    @Id
    private Long id;
    private Long serviceId;
    private String title;
    private String description;
    private String type;
    private Long count;
    private BigDecimal amount;
    private BigDecimal rate;
    private Long minCount;
    private Long maxCount;
    private BigDecimal defaultMinBill;
    private Integer packagesValidity;
    private Integer discountType;
    private BigDecimal discount;
    private DomainStatus domainStatus;
    private Boolean isDefault;
}

