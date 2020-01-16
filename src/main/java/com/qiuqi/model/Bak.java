package com.qiuqi.model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "bak")
public class Bak {

    @Column(name = "bak_id", unique = true, nullable = false, length = 20)
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String bak_id;

    @Column(name = "bak_name", nullable = false, length = 20)
    private String bak_name;

    @Column(name = "bak_price", nullable = false, length = 10)
    private Float bak_price;
}
