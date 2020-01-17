package com.qiuqi.api;

import com.qiuqi.model.Bak;
import com.qiuqi.model.Discount;
import com.qiuqi.service.BakService;
import com.qiuqi.service.DiscountService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/discount")
public class DiscountApi {

    @Autowired
    private DiscountService discountService;

    @ApiOperation(value = "add discount")
    @PostMapping(value = "/discounts/")
    @ResponseStatus(HttpStatus.CREATED)
    public Discount addDiscount(@RequestBody Discount discount){
        return discountService.addDiscount(discount);
    }
}