package com.qiuqi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "taste")
public class Taste {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "id", unique = true, nullable = false, length = 20)
    private String id;

    @Column(name = "taste_name", unique = true, nullable = false, length = 20)
    private String taste_name;

    @OneToMany(mappedBy = "taste")
    private List<Bak> bakList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaste_name() {
        return taste_name;
    }

    public void setTaste_name(String taste_name) {
        this.taste_name = taste_name;
    }
}
