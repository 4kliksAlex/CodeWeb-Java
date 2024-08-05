package io.github.kliksalex.codeweb.operationlayer.controller;

//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    private final InMemoryUserDetailsManager userDetailsService;
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public AuthController(InMemoryUserDetailsManager userDetailsService, PasswordEncoder passwordEncoder) {
//        this.userDetailsService = userDetailsService;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<String> register(@RequestBody Map<String, String> user) {
//        String username = user.get("username");
//        String password = user.get("password");
//
//        if (userDetailsService.userExists(username)) {
//            return ResponseEntity.badRequest().body("User already exists");
//        }
//
//        userDetailsService.createUser(User.builder()
//                .username(username)
//                .password(passwordEncoder.encode(password))
//                .roles("USER")
//                .build());
//
//        return ResponseEntity.ok("User registered successfully");
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
//        String username = credentials.get("username");
//        String password = credentials.get("password");
//
//        if (!userDetailsService.userExists(username)) {
//            return ResponseEntity.status(401).body("Invalid username or password");
//        }
//
//        User user = (User) userDetailsService.loadUserByUsername(username);
//        if (!passwordEncoder.matches(password, user.getPassword())) {
//            return ResponseEntity.status(401).body("Invalid username or password");
//        }
//
//        return ResponseEntity.ok("User logged in successfully");
//    }
//}