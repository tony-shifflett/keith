package com.rodeo.demo.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "services")
@Getter @Setter @NoArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "service_name", nullable = false)
    private String serviceName;

    private String description;

    @ManyToMany(mappedBy = "services")
    private Set<Job> jobs = new HashSet<>();

    @OneToMany(mappedBy = "service")
    private List<OrderDetails> orderDetails = new ArrayList<>();
}
