package com.BorrowerService.Controller;


import com.BorrowerService.Entity.Borrower;
import com.BorrowerService.Error.BorrowerNotFoundException;
import com.BorrowerService.Service.IBorrowerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping("borrowers")
public class BorrowerController {
    @Autowired
public IBorrowerService borrowerService;
    @PostMapping("/save")
    public Borrower Save(@Valid @RequestBody Borrower borrower)

    {


        return  borrowerService.saveBorrower(borrower);
    }
    @GetMapping("/get/{id}")
    public Borrower GetById(@PathVariable ("id") Long borrowerId) throws BorrowerNotFoundException {



        return  borrowerService.getBorrowerById(borrowerId);
    }
    @GetMapping("/getIdByTc/{tcNumber}")
    public Long GetborrowerIdByTcnumber(@PathVariable ("tcNumber") Long tcNumber) throws BorrowerNotFoundException {



        return  borrowerService.getBorrowerByTcnumber(tcNumber);
    }

}


