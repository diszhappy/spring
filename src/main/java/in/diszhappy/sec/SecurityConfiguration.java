/*package in.diszhappy.sec;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
*//**
 * 
 * @author Saumm
 * Created on 17-Jul-2017 12:44:05 AM
 *//*
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  *//**
   * This section defines the user accounts which can be used for authentication as well as the roles each user has.
   *//*
  @Override
  public void configure(AuthenticationManagerBuilder auth) throws Exception {

    auth.inMemoryAuthentication()
      .withUser("saumm").password("saumm").roles("USER");
  }
  *//**
   * This will disable csrf token as the api will only be used by non browser client. 
   *//*
  @Override
  protected void configure(HttpSecurity http) throws Exception {
  	http
  	.csrf().disable();
  }
}*/