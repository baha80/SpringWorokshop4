package tn.esprit.examencoaching.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class message {

    @AfterReturning("execution(* tn.esprit.examencoaching.services.*.add*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info(" Fin méthode "+name+" avec succès ");
    }
}


/*
* @Around("execution(* tn.esprit.spring.service.*.*(..))")
public Object profile(ProceedingJoinPoint pjp) throws Throwable {
long start = System.currentTimeMillis();
Object obj = pjp.proceed();
long elapsedTime = System.currentTimeMillis() - start;
l.info("Method execution time: " + elapsedTime + " milliseconds.");
return obj;
}
*/
