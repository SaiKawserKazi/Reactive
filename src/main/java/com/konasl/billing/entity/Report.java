package com.konasl.billing.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@Table("records")
public class Report {
    @Id
    private Long id;
    private Long aspId;
    private Long serviceId;
    private Long productId;
    private Long packageId;
    private Long count;
    private BigDecimal amount;
    private Date startTime;
}
