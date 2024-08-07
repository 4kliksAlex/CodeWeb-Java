package io.github.kliksalex.codeweb.operationlayer.config;

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
                .set(requestServerNameRewriter().outgoingServers("localhost:8000"))
                .add(requestMapping("non operation layer")
                        .pathRegex("/(?!auth/|scene/).*"));
    }
}