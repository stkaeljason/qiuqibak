package com.qiuqi.model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "discount_id", unique = true, nullable = false, length = 20)
    private String discount_id;

    @Column(name = "discount_name", unique = true, nullable = false, length = 20)
    private String discount_name;
}
