package cn.netbuffer.mapstruct.demo.controller;

import cn.netbuffer.mapstruct.demo.converter.CarConverter;
import cn.netbuffer.mapstruct.demo.converter.CarConverterComponent;
import cn.netbuffer.mapstruct.demo.dto.CarDto;
import cn.netbuffer.mapstruct.demo.pojo.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/car")
public class CarController {

    @Resource
    private CarConverterComponent carConverterComponent;

    @GetMapping("carToCarDto")
    public CarDto carToCarDto(Car car) {
        log.debug("receive Car={}", car);
        CarDto carDto = CarConverter.INSTANCE.carToCarDto(car);
        log.debug("convert to CarDto={}", carDto);
        return carDto;
    }

    @GetMapping("comp/carToCarDto")
    public CarDto compCarToCarDto(Car car) {
        return carConverterComponent.carToCarDto(car);
    }

}