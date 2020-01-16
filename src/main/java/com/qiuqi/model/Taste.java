package com.qiuqi.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "taste")
public class Taste {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "taste_id", unique = true, nullable = false, length = 20)
    private String taste_id;

    @Column(name = "taste_name", unique = true, nullable = false, length = 20)
    private String taste_name;
}
