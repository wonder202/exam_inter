package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "EX_ADDRESS")
@SequenceGenerator(name = "SEQ_EX_ADDRESS_CODE",
    sequenceName = "SEQ_EX_ADDRESS_CODE",
    initialValue = 1, allocationSize = 1)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EX_ADDRESS_CODE" )
    Long code;

    @Column(length = 100)
    private String address = null;

    @Column( length = 6)
    private String postcode = null;

    @CreationTimestamp
    @Column(name = "REGDATE", updatable = false)
    private Date regdate = null;

    @ManyToOne
    @JoinColumn(name = "MEMBERID", referencedColumnName = "ID")
    private Member member;
}
