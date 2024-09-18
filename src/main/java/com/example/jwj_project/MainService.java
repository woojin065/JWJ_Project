package com.example.jwj_project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {

    public int main1() {
        //랜덤값 생성
        int random = (int) (Math.random() * 100);
        return random;
    }
}
