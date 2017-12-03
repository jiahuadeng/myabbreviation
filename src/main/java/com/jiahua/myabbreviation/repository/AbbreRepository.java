package com.jiahua.myabbreviation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jiahua.myabbreviation.entity.Abbre;


public interface AbbreRepository extends CrudRepository<Abbre, String> {

}
