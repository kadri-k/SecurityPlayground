package com.northcoders.SecurityPlayground.controller;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/api/v1")
public class SecurityController {

    @GetMapping("/open/greeting")
    public String openGreeting() {
        return "Hello";
    }
    @GetMapping("/protected/greeting")
    public String protectedGreeting(@AuthenticationPrincipal OAuth2User oAuth2User) {

        return "Hello " + oAuth2User.getAttribute("name");
    }

}
