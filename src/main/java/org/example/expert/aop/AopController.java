package org.example.expert.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopController {
    // org.example.expert.domain.user.controller
    // org.example.expert.domain.comment.controller
    @Pointcut("execution(* org.example.expert.domain..controller.*AdminController.*(..))")
    public void ControllerMethods() {}

    /** 실행 전 동작
    @Before("ControllerMethods()")
    public void logBefore() {
        System.out.println("Start: Method execution");
    } **/

    // 실행 후 동작
    @After("ControllerMethods()") //
    public void logAfter() {
        System.out.println("End: Method execution");
    }
/** 실행 전후 동작
    @Around("ControllerMethods()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("Start: " + joinPoint.getSignature().getName() + " method");

        Object result = joinPoint.proceed(); // 메서드 실행

        long endTime = System.currentTimeMillis();
        System.out.println("End: " + joinPoint.getSignature().getName() + " method, Execution time: " + (endTime - startTime) + " ms");

        return result;
    }

    정상 종료 후 동작
    @AfterReturning("ControllerMethods()")
    public void logAfterReturning() {
        System.out.println("메서드 정상 실행 후: 로그 기록");
    }

    예외 발생 시 동작
    @AfterThrowing("ControllerMethods()")
    public void logAfterThrowing() {
        System.out.println("메서드 실행 중 예외 발생: 로그 기록");
    } **/
}
