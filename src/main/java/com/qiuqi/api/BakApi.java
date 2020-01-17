package com.qiuqi.api;

import com.qiuqi.model.Bak;
import com.qiuqi.service.BakService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bak")
public class BakApi {

    @Autowired
    private BakService bakService;

    @ApiOperation(value = "add bak")
    @PostMapping(value = "/baks/")
    @ResponseStatus(HttpStatus.CREATED)
    public Object addBak(@RequestBody Bak bak){
        return bakService.addBak(bak);
    }
}
