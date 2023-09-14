package com.aligunes.utility;

import java.util.Optional;

public interface IService<T,ID> {

    T save(T t);
    Iterable<T> saveAll(Iterable<T> t);


    T update(T t);


    void delete(T t);
    void deleteById(ID id);


    Optional<T> findById(ID id);
    Iterable<T> findAll();
}
