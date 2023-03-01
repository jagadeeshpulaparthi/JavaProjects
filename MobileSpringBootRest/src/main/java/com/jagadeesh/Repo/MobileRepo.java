package com.jagadeesh.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jagadeesh.model.Mobile;
@Repository
public interface MobileRepo extends CrudRepository<Mobile, Integer> {

}
