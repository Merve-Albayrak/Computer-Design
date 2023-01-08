package com.BorrowRecordService.Repository;

import com.BorrowRecordService.Entity.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorrowRecordRepository extends JpaRepository<BorrowRecord,Long> {



}
