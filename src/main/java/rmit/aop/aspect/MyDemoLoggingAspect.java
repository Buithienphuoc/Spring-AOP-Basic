package rmit.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // This is where we add all of our related advices for logging
    // Let's start with @Before advice
    @Before("execution(public void rmit.aop.dao.AccountDAO.addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("====>>> Executing @Before advice on AccountDAO.addAccount()");
    }

    @Before("execution(public void rmit.aop.dao.MembershipDAO.addAccount())")
    public void beforeAddMembershipAccountAdvice(){
        System.out.println("====>>> Executing @Before advice on MembershipDAO.addAccount()");
    }

    @Before("execution(public void add*())")
    public void beforeAddSillyMember(){
        System.out.println("====>>> Executing @Before advice on every method start with 'add' word ");
    }

    @Before("execution(public Boolean is*())")
    public void beforeCheckTrueMember(){
        System.out.println("====>>> Executing @Before advice on every Boolean method start with 'is' word ");
    }

}
