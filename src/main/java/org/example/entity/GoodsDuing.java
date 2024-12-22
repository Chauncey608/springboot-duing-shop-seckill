package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: goods_duing
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDuing {
    /**
     * Column: id
     * Type: BIGINT
     */
    private Long id;

    /**
     * Column: goods_id
     * Type: VARCHAR(100)
     * Remark: 商品ID
     */
    private String goodsId;

    /**
     * Column: goods_name
     * Type: VARCHAR(100)
     * Remark: 商品名字
     */
    private String goodsName;

    /**
     * Column: goods_type
     * Type: VARCHAR(100)
     * Remark: 商品类别
     */
    private String goodsType;

    /**
     * Column: price
     * Type: DOUBLE
     * Remark: 商品价格
     */
    private Double price;

    /**
     * Column: img_path
     * Type: VARCHAR(200)
     * Remark: 商品图片地址
     */
    private String imgPath;

    private SeckillGoods seckillGoods;
}