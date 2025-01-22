package com.rodeo.demo.database.dao;

import com.rodeo.demo.database.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServiceDAO extends JpaRepository<Service, Integer> {
    // Example custom query
    List<Service> findByServiceNameContaining(String keyword);
}
