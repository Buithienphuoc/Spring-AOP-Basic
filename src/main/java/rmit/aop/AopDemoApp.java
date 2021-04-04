package rmit.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rmit.aop.config.DemoConfig;
import rmit.aop.dao.AccountDAO;
import rmit.aop.dao.MembershipDAO;
import rmit.aop.model.Account;

public class AopDemoApp {
    public static void main(String[] args){
        System.out.println("---------------------runMyDemoLoggingAspect--------------------");
        runMyDemoLoggingAspect();
        System.out.println("---------------------runLoggingMethodWithArgsAspect--------------------");
        runLoggingMethodWithArgsAspect();
    }
    public static void runMyDemoLoggingAspect(){
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        // get bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        // call the business method
        accountDAO.addAccount();
        membershipDAO.addAccount();
        membershipDAO.addSillyMember();
        membershipDAO.isMember();
        // close the context
        context.close();
    }
    public static void runLoggingMethodWithArgsAspect(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        Account account = new Account();
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        accountDAO.addRealAccount(account);
        context.close();
    }
}
