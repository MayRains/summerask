package com.atguigu.summerask.pojo;

public class Car {
    private String brand;
    private Integer period;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", period=" + period +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }
}
