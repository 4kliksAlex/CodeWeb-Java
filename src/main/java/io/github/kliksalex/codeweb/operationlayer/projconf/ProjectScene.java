// src/main/java/io/github/kliksalex/codeweb/operationlayer/projconf/ProjectScene.java
package io.github.kliksalex.codeweb.operationlayer.projconf;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ProjectScene {
    private Scene scene;

    @Data
    public static class Scene {
        private List<MissionRequest> mission;
        private String message;
    }

    @Data
    public static class MissionRequest {
        private Map<String, Map<String, Object>> additionalProperties;
    }
}