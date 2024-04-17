package com.hgkj.model.entity;

public class Computer {
    private int computerId;
    private String computerName;
    private double computerPrice;
    private String computerType;

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public double getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(double computerPrice) {
        this.computerPrice = computerPrice;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (computerId != computer.computerId) return false;
        if (Double.compare(computer.computerPrice, computerPrice) != 0) return false;
        if (computerName != null ? !computerName.equals(computer.computerName) : computer.computerName != null)
            return false;
        if (computerType != null ? !computerType.equals(computer.computerType) : computer.computerType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = computerId;
        result = 31 * result + (computerName != null ? computerName.hashCode() : 0);
        temp = Double.doubleToLongBits(computerPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (computerType != null ? computerType.hashCode() : 0);
        return result;
    }
}
