package service;

import model.Account;
import model.User;

public interface AccountService {

    Account create(User user,String nameOfAccount, Integer sumOfAccount);

    Account update(String nameOfAccount, Integer sumOfAccount);

    void delete(String nameOfAccount);


}
