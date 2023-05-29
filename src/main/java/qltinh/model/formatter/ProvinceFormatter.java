package qltinh.model.formatter;

import qltinh.entity.Province;
import qltinh.model.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

public class ProvinceFormatter implements Formatter <Province> {
    private IProvinceService iProvinceService;
    @Autowired
    public ProvinceFormatter(IProvinceService iProvinceService){
        this.iProvinceService=iProvinceService;
    }
    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        Optional<Province> provinceOptional=iProvinceService.findByID(Long.parseLong(text));
        return provinceOptional.orElse(null);
    }

    @Override
    public String print(Province object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}
