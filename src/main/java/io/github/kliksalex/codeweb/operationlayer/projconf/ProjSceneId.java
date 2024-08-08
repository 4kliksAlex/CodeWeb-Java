package io.github.kliksalex.codeweb.operationlayer.projconf;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ProjSceneId implements Serializable {
    private String projectName;
    private String username;
}