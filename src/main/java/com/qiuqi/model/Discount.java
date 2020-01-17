package com.qiuqi.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiscount_name() {
        return discount_name;
    }

    public void setDiscount_name(String discount_name) {
        this.discount_name = discount_name;
    }
}
