package com.ustc.edu.mapper;

import com.ustc.edu.model.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryMapper {
    List<Country> selectAll();
}
