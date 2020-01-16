package com.qiuqi.model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.validation.constraints.NotNull;

@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Entity
public class User {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
//    @NotNull
    private String id;

//    @NotNull
    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
