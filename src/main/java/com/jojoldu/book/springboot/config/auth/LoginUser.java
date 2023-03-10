package com.jojoldu.book.springboot.config.auth;
import org.springframework.http.RequestEntity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) // 이 어노테이션이 생성될 수 있는 위치를 지정
@Retention(RetentionPolicy.RUNTIME)
// 파일을 어노테이션 클래스로 기정
public @interface LoginUser {

}
