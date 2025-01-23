package com.devlop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlop.Model.ProfilesModel;



@Repository
public interface ProfileRepository extends JpaRepository<ProfilesModel,Integer> {

}
