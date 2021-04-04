package rmit.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount(){
        System.out.println(getClass() + "'s doing stuff: add membership account \n");
    }

    public void addSillyMember(){
        System.out.println(getClass() + "'s doing: add silly member \n");
    }

    public Boolean isMember(){
        System.out.println(getClass() + "'s doing: check member is true \n");
        return true;
    }
}
