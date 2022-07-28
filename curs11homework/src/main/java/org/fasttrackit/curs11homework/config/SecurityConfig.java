package org.fasttrackit.curs11homework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain httpSecurityConfig(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(
                        authz -> authz
                                .mvcMatchers("/school-info").permitAll()
                                .mvcMatchers("/students").authenticated()
                                .mvcMatchers(HttpMethod.POST,"/students").hasAnyRole("ROLE_TEACHER","ROLE_DIRECTOR")
                                .mvcMatchers(HttpMethod.POST,"/teacher-evaluation").hasRole("ROLE_STUDENT")
                                .mvcMatchers(HttpMethod.POST,"/teachers").hasRole("ROLE_DIRECTOR")
                                .anyRequest().denyAll()

                )
                .formLogin()
                .and()
                .httpBasic()
                .and().csrf().disable();
        return http.build();
    }
}
