package com.vercel.Backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
  @Bean
  protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    http
        .authorizeRequests()
        .antMatchers("/css/**", "/js/**", "/registration").permitAll()
        .anyRequest().authenticated()
        .and()
        .formLogin()
        .loginPage("/login")
        .permitAll()
        .and()
        .logout()
        .permitAll();

    return http.build();
  }

}
