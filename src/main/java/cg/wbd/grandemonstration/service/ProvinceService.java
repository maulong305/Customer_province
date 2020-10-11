package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.model.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();


    Province save(Province province);

    void remove(Long id);

    Province findById(Long id);

}
