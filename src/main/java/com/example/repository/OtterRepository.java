package com.example.repository;

import com.example.Otter;
import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;

/**
 * Created by minlee on 6/17/16.
 */
public interface OtterRepository extends CrudRepository<Otter, Long> {

    Iterable<Otter> findByName(String name);

}
