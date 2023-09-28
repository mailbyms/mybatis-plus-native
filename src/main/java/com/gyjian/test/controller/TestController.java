package com.gyjian.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gyjian.test.config.GraalReflectionAotHints;
import com.gyjian.test.entity.User;
import com.gyjian.test.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "测试用控制器")
@RestController
@GraalReflectionAotHints
public class TestController {

    private final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    @Operation(summary = "查找用户")
    public User test() {
        LambdaQueryWrapper<User> chatHistoryWrapper = new LambdaQueryWrapper<User>()
                .orderByAsc(User::getId)
                .eq(User::getId, 1L);

        return userService.getOne(chatHistoryWrapper);
    }
}
