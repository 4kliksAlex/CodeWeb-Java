// src/main/java/io/github/kliksalex/codeweb/operationlayer/projconf/ProjConfController.java
package io.github.kliksalex.codeweb.operationlayer.projconf;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/scene")
@RequiredArgsConstructor
public class ProjConfController {
    private final ProjConfService service;

    @PostMapping
    public ResponseEntity<?> saveScene(
            @RequestParam String project_name,
            @RequestParam String username,
            @RequestBody ProjectScene projectScene
    ) {
        service.saveScene(project_name, username, projectScene);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ProjectScene> restoreScene(
            @RequestParam String project_name,
            @RequestParam String username
    ) {
        ProjectScene projectScene = service.restoreScene(project_name, username);
        return ResponseEntity.ok(projectScene);
    }
}