package com.example.springtest.controller;

import com.example.springtest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
@ResponseBody
public class UserController {
    private final UserService userService;

}
