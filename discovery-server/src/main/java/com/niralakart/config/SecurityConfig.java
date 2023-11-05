//package com.niralakart.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Value("${spring.security.username}")
//    private String Username;
//    @Value("${spring.security.user.Password}")
//    private String Password;
//    @Override
//    public  void configure(AuthenticationManagerBuilder authenticationManagerBuilder)throws Exception {
//        authenticationManagerBuilder.inMemoryAuthentication()
//                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser(Username).password(Password)
//                .authorities("USER");
//    }
//        @Override
//                public void configure(HttpSecurity httpSecurity) throws Exception{
//            httpSecurity.csrf().disable()
//                    .authorizeRequests().anyRequest()
//                    .authenticated()
//                    .and()
//                    .httpBasic();
//        }
//    }
//
