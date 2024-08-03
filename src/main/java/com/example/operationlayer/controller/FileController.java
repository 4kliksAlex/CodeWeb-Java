package com.example.operationlayer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/files")
public class FileController {

    @PostMapping
    public String createFile(@RequestBody String filePath) {
        // Logic to create a file
        return "File created successfully";
    }

    @PutMapping("/{oldPath}")
    public String renameFile(@PathVariable String oldPath, @RequestBody String newPath) {
        // Logic to rename a file
        return "File renamed successfully";
    }

    @DeleteMapping("/{path}")
    public String deleteFile(@PathVariable String path) {
        // Logic to delete a file
        return "File deleted successfully";
    }

    @PatchMapping("/{path}")
    public String modifyFile(@PathVariable String path, @RequestBody String content) {
        // Logic to modify a file
        return "File modified successfully";
    }

    @GetMapping("/{path}")
    public String getFileContent(@PathVariable String path) {
        // Logic to get the content of a file
        return "File content";
    }
}