package com.devlop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlop.Model.ToolsModel;



@Repository
public interface ToolsRepository extends JpaRepository<ToolsModel,Integer> {

}
