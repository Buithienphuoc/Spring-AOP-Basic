package rmit.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingMethodWithArgsAspect {
    @Before("execution(* add*(rmit.aop.model.Account))")
    public void beforeAddRealAccount(){
        System.out.println(" ====>>>> before add a real account");
    }
}
