package com.haoyu.girl.service;

import com.haoyu.girl.domain.Girl;
import com.haoyu.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlA.setCupSize("B");
        girlA.setAge(19);
        girlRepository.save(girlB);
    }
}
