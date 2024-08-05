package io.github.kliksalex.codeweb.operationlayer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping
    public Set<String> getAllProjects() {
        //
        return null; // TODO
    }

    // Add more methods for project-related operations

}