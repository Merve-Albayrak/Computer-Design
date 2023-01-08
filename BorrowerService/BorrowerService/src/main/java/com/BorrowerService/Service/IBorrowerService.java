package com.BorrowerService.Service;

import com.BorrowerService.Entity.Borrower;
import com.BorrowerService.Error.BorrowerNotFoundException;

public interface IBorrowerService {
    Borrower saveBorrower(Borrower borrower);

    Borrower getBorrowerById(Long borrowerId) throws BorrowerNotFoundException;

    Long getBorrowerByTcnumber(Long tcNumber) throws BorrowerNotFoundException;
}
