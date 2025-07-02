package com.luv2code.springboot.todoapi.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.springframework.security.core.GrantedAuthority;

@Embeddable
public class Authority implements GrantedAuthority {

    private String authority;

    public Authority() {
    }

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return "";
    }
}
