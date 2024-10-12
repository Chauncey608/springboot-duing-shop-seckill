package org.example.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddGoodsDTO {
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
