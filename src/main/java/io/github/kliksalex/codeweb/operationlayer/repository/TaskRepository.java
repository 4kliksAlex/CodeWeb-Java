package io.github.kliksalex.codeweb.operationlayer.repository;

import io.github.kliksalex.codeweb.operationlayer.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    //
}