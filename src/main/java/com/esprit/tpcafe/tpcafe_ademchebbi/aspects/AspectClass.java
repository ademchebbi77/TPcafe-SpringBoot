package com.esprit.tpcafe.tpcafe_ademchebbi.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;



@Component // pour définir qu'il s'agit d'un bean Spring
@Aspect  // pour définir qu'il s'agit d'un aspect
@Slf4j  // pour activer le logging avec Lombok



public class AspectClass {


    //join point pour intercepter l'exécution de toutes les méthodes dans le package com.esprit.tpcafe.tpcafe_ademchebbi
    @Before("execution(* com.esprit.tpcafe.tpcafe_ademchebbi..*(..))")
    public void logMethodEntry(JoinPoint jp) {
        log.info("Entering method" + jp.getSignature().getName());
    }




    @Around("execution(* com.esprit.tpcafe.tpcafe_ademchebbi..*(..))")
    public Object logAroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed(); // exécution de la méthode interceptée
        long elapsedTime = System.currentTimeMillis() - startTime;
        log.info("Execution time of " + elapsedTime + " milliseconds,");
        return obj;
    }









}
