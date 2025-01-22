package com.rodeo.demo.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.EqualsExclude;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name ="description")
    private String description;

    @Column(name = "status")
    private String status;

    @ManyToMany
    @JoinTable(
            name = "job_services",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private Set<Service> services = new HashSet<>();

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private List<OrderDetails> orderDetails = new ArrayList<>();
}
