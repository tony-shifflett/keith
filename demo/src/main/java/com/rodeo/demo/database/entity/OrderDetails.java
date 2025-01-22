package com.rodeo.demo.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name ="cost")
    private Double cost;    // price per unit/service

    @Column(name = "quantity")
    private Integer quantity; // number of units or services required


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id", nullable = false)
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private Job job;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")    // nullable = true by default
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private Service service;
}
