package com.qiuqi.service;

import com.qiuqi.model.Discount;
import com.qiuqi.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Autowired
    private DiscountRepository discountRepository;

    public Discount addDiscount(Discount discount) {
        return discountRepository.save(discount);
    }
}
