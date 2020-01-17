package com.qiuqi.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
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

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getBak_name() {
        return bak_name;
    }

    public void setBak_name(String bak_name) {
        this.bak_name = bak_name;
    }

    public Float getBak_price() {
        return bak_price;
    }

    public void setBak_price(Float bak_price) {
        this.bak_price = bak_price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }
}
