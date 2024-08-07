// src/main/java/io/github/kliksalex/codeweb/operationlayer/projconf/ProjConfRepository.java
package io.github.kliksalex.codeweb.operationlayer.projconf;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjConfRepository extends JpaRepository<ProjScene, ProjSceneId> {
}