package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.beans.factory.annotation.Autowired;

public interface DishService {


    /**
     * 新增菜品和口味数据
     * @param dishDTO
     */
    public void saveWithFlaver(DishDTO dishDTO);
}
