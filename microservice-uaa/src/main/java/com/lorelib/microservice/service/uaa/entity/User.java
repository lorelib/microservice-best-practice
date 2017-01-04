package com.lorelib.microservice.service.uaa.entity;

import com.lorelib.microservice.commons.api.DomainObject;

import javax.persistence.*;

/**
 * Created by listening on 2017/1/3.
 */
@Entity
public class User implements DomainObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
