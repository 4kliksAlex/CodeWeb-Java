package io.github.kliksalex.codeweb.operationlayer.scene;


import io.github.kliksalex.codeweb.operationlayer.scene.ProjectSceneRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/scene")
@RequiredArgsConstructor
public class ProjectSceneController {

    private final ProjectSceneService service;

    @PostMapping
    public ResponseEntity<?> saveScene(
            @RequestParam String project_name,
            @RequestParam String username,
            @RequestBody ProjectSceneRequest request
    ) {
        service.saveScene(project_name, username, request);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ProjectSceneRequest> getScene(
            @RequestParam String project_name,
            @RequestParam String username
    ) {
        ProjectSceneRequest scene = service.getScene(project_name, username);
        return ResponseEntity.ok(scene);
    }
}