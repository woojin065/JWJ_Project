package com.example.jwj_project;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class MainlController {

    private final MainService mainService;

    @Operation(summary = "랜덤값 전송 ")
    @PostMapping("/email")
    public int sendEmail() {
        return mainService.main1();
    }
}
