package com.qiuqi.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "bakDiscount")
public class BakDiscount {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "bak_id", nullable = false, length = 20)
    private String bak_id;

    @Column(name = "discount_id", nullable = false, length = 20)
    private String discount_id;
}