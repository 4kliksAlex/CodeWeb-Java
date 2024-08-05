package com.alibou.security.config;

import com.github.mkopylec.charon.configuration.CharonConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.mkopylec.charon.configuration.CharonConfigurer.charonConfiguration;
import static com.github.mkopylec.charon.configuration.RequestMappingConfigurer.requestMapping;
import static com.github.mkopylec.charon.forwarding.interceptors.rewrite.RequestServerNameRewriterConfigurer.requestServerNameRewriter;

@Configuration
class CharonConfiguration {

    private static final String CHARON_CONFIGURER_BEAN = "charonConfigurer";

    @Bean(CHARON_CONFIGURER_BEAN)
    CharonConfigurer charonConfigurer() {
        return charonConfiguration()
//                .set(requestServerNameRewriter().outgoingServers("host1:8080", "host2:8081"))
                .set(requestServerNameRewriter().outgoingServers("host1:8080"))
                .add(requestMapping("mapping name")
                        .pathRegex("/api/.*"));
    }
}