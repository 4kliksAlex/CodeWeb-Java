package io.github.kliksalex.codeweb.operationlayer.repository;

import io.github.kliksalex.codeweb.operationlayer.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
    //
}