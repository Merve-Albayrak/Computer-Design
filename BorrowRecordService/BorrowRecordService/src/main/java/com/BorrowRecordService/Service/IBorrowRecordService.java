package com.BorrowRecordService.Service;

import com.BorrowRecordService.Entity.BorrowRecord;
import org.springframework.stereotype.Service;

@Service
public interface IBorrowRecordService {
    BorrowRecord saveRecord(BorrowRecord borrowRecord);
}
