package com.rodeo.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable());

        http.authorizeHttpRequests((authorize) -> authorize
                .requestMatchers("/").permitAll()
                .requestMatchers("/login/**", "/logout/**").permitAll()
                .requestMatchers("/signup/**").permitAll()
                .requestMatchers("/work_orders/**").authenticated()
                .anyRequest().permitAll()
        );

        http.formLogin(formLogin -> formLogin
                .loginPage("/login/")
                .loginProcessingUrl("/login/loginSubmit")
                .defaultSuccessUrl("/index", true)
                .failureUrl("/login?error=true")
        );

        http.logout(formlogout -> formlogout
                .invalidateHttpSession(true)
                .logoutUrl("/logout/logout")
                .logoutSuccessUrl("/")
                .deleteCookies("username","JSESSIONID")
        );

        http.exceptionHandling(exception -> exception
                .accessDeniedPage("/404")
        );

        return http.build();
    }

    @Bean(name = "passwordEncoder")
    public PasswordEncoder getPasswordEncoder() {return new BCryptPasswordEncoder();}

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }
}
