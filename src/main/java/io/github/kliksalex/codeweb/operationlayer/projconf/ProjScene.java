// src/main/java/io/github/kliksalex/codeweb/operationlayer/projconf/ProjScene.java
package io.github.kliksalex.codeweb.operationlayer.projconf;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@IdClass(ProjSceneId.class)
@Data
public class ProjScene {
    @Id
    private String pno;

    @Id
    private String uno;

    @Column(columnDefinition = "TEXT")
    private String scene;
}