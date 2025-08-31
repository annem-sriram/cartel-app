package com.cartelapp.controller;

import com.cartelapp.entity.BulkOrder;
import com.cartelapp.repository.BulkOrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class BulkOrderController {
    private final BulkOrderRepository bulkOrderRepository;

    public BulkOrderController(BulkOrderRepository bulkOrderRepository) {
        this.bulkOrderRepository = bulkOrderRepository;
    }

    @PostMapping
    public BulkOrder createOrder(@RequestBody BulkOrder order) {
        return bulkOrderRepository.save(order);
    }

    @GetMapping
    public List<BulkOrder> getOrders() {
        return bulkOrderRepository.findAll();
    }
}

