package com.cartelapp.repository;

import com.cartelapp.entity.BulkOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulkOrderRepository extends JpaRepository<BulkOrder, Long> {
}

