package com.BorrowRecordService.BorrowRecordController;

import com.BorrowRecordService.Entity.BorrowRecord;
import com.BorrowRecordService.Service.IBorrowRecordService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("borrowrecords")
@RestController
public class BorrowRecordController {

    @Autowired
    private IBorrowRecordService borrowRecordService;


    @PostMapping("/save")
    public BorrowRecord Save(@Valid @RequestBody BorrowRecord borrowRecord){



        return borrowRecordService.saveRecord(borrowRecord);
    }
}
