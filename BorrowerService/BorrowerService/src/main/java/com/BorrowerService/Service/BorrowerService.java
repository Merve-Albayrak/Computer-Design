package com.BorrowerService.Service;

import com.BorrowerService.Entity.Borrower;
import com.BorrowerService.Error.BorrowerNotFoundException;
import com.BorrowerService.Repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BorrowerService implements IBorrowerService {

    @Autowired
    BorrowerRepository borrowerRepository;
    @Override
    public Borrower saveBorrower(Borrower borrower) {

        return borrowerRepository.save(borrower) ;
    }

    public Borrower getBorrowerById(Long borrowerId) throws BorrowerNotFoundException {

        Optional<Borrower> borrower= borrowerRepository.findById(borrowerId);
        if(!borrower.isPresent()){




            throw  new BorrowerNotFoundException("User is not found");

        }
        return borrower.get() ;
    }

    @Override
    public Long getBorrowerByTcnumber(Long tcNumber) throws BorrowerNotFoundException {
        Optional<Long> borrower=borrowerRepository.findBorrowerIdByTcNumber(tcNumber);

        if(!borrower.isPresent()) {


            throw new BorrowerNotFoundException("Borrower tc number is not exist");

        }
        return borrower.get();
        }
    }


