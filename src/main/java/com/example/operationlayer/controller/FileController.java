package com.example.operationlayer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/files")
public class FileController {

    @PostMapping("/")
    public String createFile(@RequestBody String filePath) {
        // Logic to create a file
        return "File created successfully";
    }

    @PutMapping("/")
    public String renameFile(@RequestParam String oldFilePath, @RequestParam String newFilePath) {
        // Logic to rename a file
        return "File renamed successfully";
    }

    @DeleteMapping("/")
    public String deleteFile(@RequestParam String filePath) {
        // Logic to delete a file
        return "File deleted successfully";
    }

    @PatchMapping("/")
    public String modifyFile(@RequestParam String filePath, @RequestBody String fileContent) {
        // Logic to modify a file
        return "File modified successfully";
    }

    @GetMapping("/")
    public String getFile(@RequestParam String filePath) {
        // Logic to get the content of a file
        return "File content";
    }
}