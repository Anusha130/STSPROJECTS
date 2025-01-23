package com.devlop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlop.Model.StagesModel;



@Repository
public interface StagesRepository extends JpaRepository<StagesModel,Integer> {

}
