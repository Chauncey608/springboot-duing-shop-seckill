package org.example.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: goods
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    /**
     * Column: id
     * Type: INT
     */
    private Integer id;

    /**
     * Column: gname
     * Type: VARCHAR(255)
     */
    private String gname;

    /**
     * Column: gprice
     * Type: DECIMAL
     */
    private BigDecimal gprice;
}