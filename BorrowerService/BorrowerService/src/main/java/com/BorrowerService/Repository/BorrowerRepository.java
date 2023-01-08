package com.BorrowerService.Repository;

import com.BorrowerService.Entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower,Long> {
    @Query( value="select id from borrower where borrower.tc_number=:tcNumber",
            nativeQuery = true)

    Optional<Long> findBorrowerIdByTcNumber(Long tcNumber);
}
