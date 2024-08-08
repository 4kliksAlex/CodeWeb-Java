package io.github.kliksalex.codeweb.operationlayer.projconf;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scene")
@RequiredArgsConstructor
public class ProjSceneController {
    private final ProjSceneService service;

    @PostMapping
    public ResponseEntity<?> saveScene(
            @RequestParam String projectName,
            @RequestParam String username,
            @RequestBody ProjectScene projectScene
    ) {
        service.saveScene(projectScene);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ProjectScene> getScene(
            @RequestParam String projectName,
            @RequestParam String username
    ) {
        ProjectScene scene = service.getScene(projectName, username);
        return ResponseEntity.ok(scene);
    }
}