package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "EX_ORDER")
@SequenceGenerator(name = "SEQ_EX_ORDER_NO",
    sequenceName = "SEQ_EX_ORDER_NO",
    initialValue = 1, allocationSize = 1)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EX_ORDER_NO" )
    Long no;

    Long cnt;

    @CreationTimestamp
    @Column(name = "REGDATE", updatable = false)
    private Date regdate = null;

    @ManyToOne
    @JoinColumn(name = "MEMBERID", referencedColumnName = "ID")
    private Member member;

    @OneToOne
    @JoinColumn(name = "ITEMCODE", referencedColumnName = "CODE")
    private Item item;
}
