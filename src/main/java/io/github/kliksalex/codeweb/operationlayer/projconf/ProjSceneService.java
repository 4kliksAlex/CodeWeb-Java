package io.github.kliksalex.codeweb.operationlayer.projconf;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjSceneService {
    private final ProjSceneRepository repository;

    public void saveScene(ProjectScene projectScene) {
        ProjSceneId id = new ProjSceneId(projectScene.getProjectName(), projectScene.getUsername());
        ProjScene scene = new ProjScene(id, projectScene.getScene());
        repository.save(scene);
    }

    public ProjectScene getScene(String projectName, String username) {
        ProjSceneId id = new ProjSceneId(projectName, username);
        ProjScene scene = repository.findById(id).orElseThrow(() -> new RuntimeException("Scene not found"));
        return ProjectScene.builder()
                .projectName(projectName)
                .username(username)
                .scene(scene.getScene())
                .build();
    }
}