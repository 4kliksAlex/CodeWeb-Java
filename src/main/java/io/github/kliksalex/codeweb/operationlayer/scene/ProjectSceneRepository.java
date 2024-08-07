package io.github.kliksalex.codeweb.operationlayer.scene;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectSceneRepository extends JpaRepository<ProjectScene, Integer> {
    // Define custom query methods if needed
}