package com.tejacodes.blogapplication.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/*
 * It is the entry point to check if a user is authenticated and logs the person in or throws exception (unauthorized)
 * AuthenticationEntryPoint is used in Spring Web Security to configure an 
 * application to perform certain actions whenever an unauthenticated client tries to access private resources.
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
	
	/*
	 * This method is called whenever an exception is thrown due to an unauthenticated user
	 * trying to access a resource that requires authentication.
	 */
	@Override
	public void commence(HttpServletRequest request, 
						 HttpServletResponse response,
						 AuthenticationException authException) throws IOException, ServletException {
		
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
	}

}
