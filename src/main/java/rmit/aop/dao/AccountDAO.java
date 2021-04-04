package rmit.aop.dao;

import org.springframework.stereotype.Component;
import rmit.aop.model.Account;

@Component
public class AccountDAO {
    public void addAccount(){
        System.out.println(getClass() + " is doing my db work: adding an account \n");
    }

    public void addRealAccount(Account account){
        System.out.println(getClass() + " is doing work: adding a read account:" + account.getName());
    }
}
