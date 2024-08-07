package io.github.kliksalex.codeweb.operationlayer.projconf;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjConfRepository extends JpaRepository<ProjConf, Integer> {

  Optional<ProjConf> findByEmail(String email);

}
