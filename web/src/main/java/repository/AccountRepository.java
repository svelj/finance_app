package repository;

import model.Account;
import model.Transaction;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    Optional<Account> findAccountById(Integer id);

    List<Account> findAccountsByUser(User user);


}
