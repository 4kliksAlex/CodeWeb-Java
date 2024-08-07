package io.github.kliksalex.codeweb.operationlayer.scene;

import lombok.Data;
import java.util.List;

@Data
public class ProjectSceneRequest {
    private Scene scene;

    @Data
    public static class Scene {
        private List<MissionRequest> mission;
        private String message;
    }
}