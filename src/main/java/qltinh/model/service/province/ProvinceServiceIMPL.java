package qltinh.model.service.province;

import qltinh.entity.Province;
import qltinh.model.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProvinceServiceIMPL implements IProvinceService{
    @Autowired
    private IProvinceRepository provinceRepository;
    @Override
    public Iterable<Province> findALl() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findByID(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
provinceRepository.deleteById(id);
    }
}
