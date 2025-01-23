package com.devlop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlop.Model.EnvModel;



@Repository
public interface EnvRepository extends JpaRepository<EnvModel,Integer>{

}
