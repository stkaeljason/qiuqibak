package com.qiuqi.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bak")
public class Bak {

    @Column(name = "id", unique = true, nullable = false, length = 20)
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    @Column(name = "bak_name", nullable = false, length = 20)
    private String bak_name;

    @Column(name = "bak_price", nullable = false, length = 10)
    private Float bak_price;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
    @JoinColumn(name = "taste_id",nullable = false)
    private Taste taste;

    @ManyToMany
    private List<Discount> discountList;
}
