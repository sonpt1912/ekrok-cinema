package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.entity.ChairType;
import com.example.cinemaservice.repository.ChairRepository;
import com.example.cinemaservice.repository.ChairTypeRepository;
import com.example.cinemaservice.service.ChairService;
import com.example.cinemaservice.service.ChairTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChairTypeServiceImpl implements ChairTypeService {

    @Autowired
    private ChairTypeRepository chairTypeRepository;

    @Override
    public Object createChairType(ChairType chairType) {
        return null;
    }

    @Override
    public Object updatechairType(ChairType chairType) {
        return null;
    }
}
