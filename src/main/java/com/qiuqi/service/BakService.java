package com.qiuqi.service;

import com.qiuqi.model.Bak;
import com.qiuqi.repository.BakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BakService {
    @Autowired
    private BakRepository bakRepository;

    public Bak addBak(Bak bak){
        return bakRepository.save(bak);
    }
}
