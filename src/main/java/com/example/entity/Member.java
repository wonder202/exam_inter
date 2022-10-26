package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "EX_MEMBER")
public class Member {
    @Id
    @Column(name = "ID", length = 30)
    String id;

    @Column(length = 200)
    String password;

    @Column(length = 30)
    String name;

    @Column(length = 20)
    String role = "CUSTOMER";

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm.ss.SSS")
    @CreationTimestamp
    @Column(name = "REGDATE", updatable = false)
    Date regdate = null;
}
