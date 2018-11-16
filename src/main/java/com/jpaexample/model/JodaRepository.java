package com.jpaexample.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface JodaRepository extends CrudRepository<Joda, Long> {

}