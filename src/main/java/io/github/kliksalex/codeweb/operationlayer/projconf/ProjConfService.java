package io.github.kliksalex.codeweb.operationlayer.projconf;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@RequiredArgsConstructor
public class ProjConfService {
    private final ProjConfRepository repository;
    private final ObjectMapper objectMapper;

    public void saveScene(String projectName, String username, ProjectScene projectScene) {
        try {
            String sceneJson = objectMapper.writeValueAsString(projectScene);
            ProjScene projScene = new ProjScene();
            projScene.setPno(projectName);
            projScene.setUno(username);
            projScene.setScene(sceneJson);
            repository.save(projScene);
        } catch (Exception e) {
            throw new RuntimeException("Failed to save scene", e);
        }
    }

    public ProjectScene restoreScene(String projectName, String username) {
        return repository.findById(new ProjSceneId(projectName, username))
                .map(projScene -> {
                    try {
                        return objectMapper.readValue(projScene.getScene(), ProjectScene.class);
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to restore scene", e);
                    }
                })
                .orElseThrow(() -> new RuntimeException("Scene not found"));
    }
}