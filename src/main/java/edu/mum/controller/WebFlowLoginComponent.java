package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.mum.domain.Login;
import edu.mum.service.LoginService;

@Component
public class WebFlowLoginComponent {

    @Autowired
    LoginService loginService;

    public String verify(Login login) {

        return loginService.verify(login);
    }

}
