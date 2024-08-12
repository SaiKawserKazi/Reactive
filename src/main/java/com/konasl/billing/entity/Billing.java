package com.konasl.billing.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@Table("billing")
public class Billing {
    @Id
    private Long id;
    private Long aspId;
    private BigDecimal amount;
    private Date billingDate;
    private Integer status;
    private Long recordId;
}

