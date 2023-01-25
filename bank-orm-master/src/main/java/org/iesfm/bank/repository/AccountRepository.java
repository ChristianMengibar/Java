package org.iesfm.bank.repository;

import org.iesfm.bank.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

    int deleteByIban(String iban);

    @Query(
            value = "SELECT a.* FROM Account a INNER JOIN Customer c ON c.id=a.owner_id WHERE nif=?",
            nativeQuery = true
    )
//    @Query(
//            value = "SELECT a FROM Account a INNER JOIN Customer c ON c.id=a.ownerId WHERE nif=?1"
//    )
    List<Account> findByNif(String customerNif);
}
