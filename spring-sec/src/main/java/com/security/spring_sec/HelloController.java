package com.security.spring_sec;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest req){
        return "Hello World " + req.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest req){
        return "Nithi " + req.getSession().getId();
    }

    @GetMapping("csrf-token")
    public CsrfToken getCSRFToken(HttpServletRequest req){
        return (CsrfToken)req.getAttribute("_csrf");
    }

}
