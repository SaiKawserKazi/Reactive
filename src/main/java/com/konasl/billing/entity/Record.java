package com.konasl.billing.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@Table("records")
public class Record {
    @Id
    private Long id;
    private Long packageId;
    private Long serviceId;
    private Long aspId;
    private Date startTime;
    private Date endTime;
    private String status;
    private Long count;
    private Date freeDate;
    private Long freeCount;
    private BigDecimal minBill;
    private String usageMonth;
    private String usageYear;
    private LocalDateTime purchaseTime;
    private String currency;
    private Long nextId;
}

