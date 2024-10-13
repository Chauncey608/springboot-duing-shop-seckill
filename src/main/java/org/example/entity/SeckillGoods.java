package org.example.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: seckill_goods
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeckillGoods {
    /**
     * Column: id
     * Type: BIGINT
     */
    private Long id;

    /**
     * Column: goods_id
     * Type: VARCHAR(100)
     */
    private String goodsId;

    /**
     * Column: seckill_price
     * Type: DOUBLE
     * Remark: 秒杀价格
     */
    private Double seckillPrice;

    /**
     * Column:  stock_num
     * Type: INT
     * Remark: 秒杀库存
     */
    private Integer stockNum;

    /**
     * Column: start_time
     * Type: DATETIME
     * Remark: 秒杀开始时间
     */
    private Date startTime;

    /**
     * Column: end_time
     * Type: DATETIME
     * Remark: 秒杀结束时间
     */
    private Date endTime;
}