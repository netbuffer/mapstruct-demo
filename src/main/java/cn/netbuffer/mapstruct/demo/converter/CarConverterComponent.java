package cn.netbuffer.mapstruct.demo.converter;

import cn.netbuffer.mapstruct.demo.dto.CarDto;
import cn.netbuffer.mapstruct.demo.pojo.Car;
import cn.netbuffer.mapstruct.demo.pojo.CarType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CarConverterComponent {

    @Mappings({
            @Mapping(source = "numberOfSeats", target = "seatCount"),
            @Mapping(target = "type", source = "carType")
    })
    CarDto carToCarDto(Car car);

    default String carType2String(CarType carType) {
        return carType.getName() + "|" + carType.getCategory();
    }

}