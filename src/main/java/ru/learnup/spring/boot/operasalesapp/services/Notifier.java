package ru.learnup.spring.boot.operasalesapp.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class Notifier {
    @Pointcut("@annotation(ru.learnup.spring.boot.operasalesapp.annotations.Notifiable)")
    public void send () {
    }
    @After("send()")
    public void sendMail(JoinPoint joinPoint) {
        System.out.println("Письмо отправленно: " + joinPoint.getSignature().getName());
    }
}

