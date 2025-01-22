package com.rodeo.demo.database.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private String status;

    @ManyToMany
    @JoinTable(
            name = "job_services",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    private Set<Service> services = new HashSet<>();

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails = new ArrayList<>();
}
