package io.github.kliksalex.codeweb.operationlayer.projconf;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProjectScene {
    private String projectName;
    private String username;
    private String scene;
}