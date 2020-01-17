package com.qiuqi.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private String id;

    @Column(name = "discount_name", unique = true, nullable = false, length = 20)
    private String discount_name;

    @ManyToMany(mappedBy = "discountList")
    private List<Bak> bakList;
}
