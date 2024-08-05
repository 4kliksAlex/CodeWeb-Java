package io.github.kliksalex.codeweb.operationlayer.config;

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/auth/register", "/auth/login").permitAll()
//                                .anyRequest().authenticated()
//                )
//                .httpBasic(Customizer.withDefaults());
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        var userDetailsManager = new InMemoryUserDetailsManager();
//        var user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//        userDetailsManager.createUser(user);
//        return userDetailsManager;
//    }
//}
//
////@Configuration
////@EnableWebSecurity
////public class SecurityConfig {
//
////    @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////        // Configure authentication provider
////        auth.inMemoryAuthentication()
////                .withUser("admin")
////                .password(passwordEncoder().encode("password"))
////                .roles("ADMIN");
////    }
//
////    @Bean
////    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http.authorizeRequests(requests -> requests.anyRequest().authenticated())
////                .formLogin(withDefaults())
////                .oauth2Login(withDefaults());
////        return http.build();
////    }
////
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
////}
