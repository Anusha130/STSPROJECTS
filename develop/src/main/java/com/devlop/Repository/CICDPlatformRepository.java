package com.devlop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlop.Model.CICDplatform;



@Repository
public interface CICDPlatformRepository extends JpaRepository<CICDplatform,Integer>{

}
