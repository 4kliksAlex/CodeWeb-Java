package com.example.operationlayer.repository;

import com.example.operationlayer.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Add custom repository methods here if needed
}