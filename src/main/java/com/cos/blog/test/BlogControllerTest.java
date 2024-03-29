package com.cos.blog.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 스프링이 com.cos.blog 패키지 이하를 스캔하여 모든 파일을 메모리에 new 하는 것은 아니구요
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서 (IOC ) 스프링 컨테이너 에서 관리해 줍니다.
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>hello spring boot</h1>";
    }

}
