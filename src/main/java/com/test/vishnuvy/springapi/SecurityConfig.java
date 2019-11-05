//package com.test.vishnuvy.springapi;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
//
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	private static final String[] AUTH_WHITELIST = {
//
//			// -- swagger ui
//			"**/swagger-resources/**", "**/swagger-ui.html", "/v2/api-docs", "/webjars/**" };
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers(AUTH_WHITELIST).authenticated().and().httpBasic()
//				.authenticationEntryPoint(swaggerAuthenticationEntryPoint()).and().csrf().disable();
//	}
//
//	@Bean
//	public BasicAuthenticationEntryPoint swaggerAuthenticationEntryPoint() {
//		BasicAuthenticationEntryPoint entryPoint = new BasicAuthenticationEntryPoint();
//		entryPoint.setRealmName("Swagger Realm");
//		return entryPoint;
//	}
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers(AUTH_WHITELIST).permitAll()
////                .antMatchers("/**/*").denyAll();
////    }
//}