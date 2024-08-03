package com.example.operationlayer.model;

public class File {
    private String name;
    private String path;
    private String content;

    public File(String name, String path, String content) {
        this.name = name;
        this.path = path;
        this.content = content;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}