package cn.netbuffer.mapstruct.demo.pojo;

import cn.netbuffer.mapstruct.demo.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mappings({
            @Mapping(source = "numberOfSeats", target = "seatCount"),
            @Mapping(target = "type", source = "carType")
    })
    CarDto carToCarDto(Car car);

    default String carType2String(CarType carType) {
        return carType.getName() + "|" + carType.getCategory();
    }

}