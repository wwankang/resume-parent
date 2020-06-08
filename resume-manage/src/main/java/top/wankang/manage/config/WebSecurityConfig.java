package top.wankang.manage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .formLogin()
                .loginPage("/login.html") //登录界面
                .loginProcessingUrl("/login") //登录认证地址,需与from表的action保持一致
                .successForwardUrl("/index.html")
                .defaultSuccessUrl("/index.html")//跳转到resume-web的resume/index路径
                .and()
                .authorizeRequests()
                .antMatchers("/login.html").permitAll() //不需登录可以访问的地址
                .anyRequest()
                .authenticated();
        http.headers().frameOptions().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**").antMatchers("/js/**").antMatchers("/error/**")
        .antMatchers("/images/**").antMatchers("/lib/**").antMatchers("/fonts/**");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
