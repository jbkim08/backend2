package com.mysite.backend.exception;

//예외를 상속받은 유저못찾음 예외 클래스
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("id에 맞는 유저가 없습니다. " + id); //에러 메세지
    }
}
