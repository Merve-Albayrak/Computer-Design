package com.BorrowRecordService.Service;

import com.BorrowRecordService.Entity.BorrowRecord;
import com.BorrowRecordService.Repository.IBorrowRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowRecordService implements IBorrowRecordService {
    @Autowired
    IBorrowRecordRepository borrowRecordRepository;


    @Override
    public BorrowRecord saveRecord(BorrowRecord borrowRecord) {
        return borrowRecordRepository.save(borrowRecord);
    }
}
