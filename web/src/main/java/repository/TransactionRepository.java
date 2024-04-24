package repository;

import model.Transaction;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    Optional<Transaction> findTransactionById(Integer id);

    Optional<Transaction> findTransactionByAmount(Integer amount);

    List<Transaction> findTransactionsByUser(User user);

}
