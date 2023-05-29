package qltinh.model.service;

import java.util.Optional;

public interface IGenerateService <T>{
    Iterable<T> findALl();
    Optional<T> findByID(Long id);
    void save(T t);
    void remove(Long id);
}
