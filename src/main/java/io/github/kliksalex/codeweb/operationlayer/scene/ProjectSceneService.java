package io.github.kliksalex.codeweb.operationlayer.scene;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectSceneService {

    private final ProjectSceneRepository repository;

    public void saveScene(String projectName, String username, ProjectSceneRequest request) {
        // Implement logic to save the scene
    }

    public ProjectSceneRequest getScene(String projectName, String username) {
        // Implement logic to retrieve the scene
        return new ProjectSceneRequest();
    }
}