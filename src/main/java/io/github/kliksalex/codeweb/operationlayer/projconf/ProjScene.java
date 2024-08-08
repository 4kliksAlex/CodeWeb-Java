package io.github.kliksalex.codeweb.operationlayer.projconf;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProjScene {
    @EmbeddedId
    private ProjSceneId id;
    private String scene;
}