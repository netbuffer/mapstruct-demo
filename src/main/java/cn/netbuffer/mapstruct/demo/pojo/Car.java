package cn.netbuffer.mapstruct.demo.pojo;

import lombok.Data;

@Data
public class Car {

    private String make;
    private int numberOfSeats;
    private CarType carType;

}