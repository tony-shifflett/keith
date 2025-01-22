package com.rodeo.demo.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "services")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "service_name", nullable = false)
    private String serviceName;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "services")
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private Set<Job> jobs = new HashSet<>();

    @OneToMany(mappedBy = "service")
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private List<OrderDetails> orderDetails = new ArrayList<>();
}
