package io.github.kliksalex.codeweb.operationlayer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final InMemoryUserDetailsManager userDetailsService;

    @Autowired
    public AuthController(UserDetailsService userDetailsService) {
        this.userDetailsService = (InMemoryUserDetailsManager) userDetailsService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Map<String, String> user) {
        String username = user.get("username");
        String password = user.get("password");

        if (userDetailsService.userExists(username)) {
            return ResponseEntity.badRequest().body("User already exists");
        }

        userDetailsService.createUser(User.withDefaultPasswordEncoder()
                .username(username)
                .password(password)
                .roles("USER")
                .build());

        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        if (!userDetailsService.userExists(username)) {
            return ResponseEntity.status(401).body("Invalid username or password");
        }

        User user = (User) userDetailsService.loadUserByUsername(username);
        if (!user.getPassword().equals("{noop}" + password)) {
            return ResponseEntity.status(401).body("Invalid username or password");
        }

        return ResponseEntity.ok("User logged in successfully");
    }
}