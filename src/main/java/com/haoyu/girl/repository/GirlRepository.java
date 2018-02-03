package com.haoyu.girl.repository;

import com.haoyu.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //search by age
    public List<Girl> findByAge(Integer age);
}
