package cn.netbuffer.mapstruct.demo.controller;

import cn.netbuffer.mapstruct.demo.dto.CarDto;
import cn.netbuffer.mapstruct.demo.pojo.Car;
import cn.netbuffer.mapstruct.demo.pojo.CarMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping("carToCarDto")
    public CarDto carToCarDto(Car car) {
        log.debug("receive Car={}", car);
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
        log.debug("convert to CarDto={}", carDto);
        return carDto;
    }

}