package com.zxdc.model.entity;

public class Resturants {
    private Integer retId;
    private int pageNumber;
    private int totalPages;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public Resturants() {
    }

    public Resturants(Integer retId, String retName, String retAddress, String retPic) {
        this.retId = retId;
        this.retName = retName;
        this.retAddress = retAddress;
        this.retPic = retPic;
    }

    @Override
    public String toString() {
        return "Resturants{" +
                "retId=" + retId +
                ", retName='" + retName + '\'' +
                ", retAddress='" + retAddress + '\'' +
                ", retPic='" + retPic + '\'' +
                '}';
    }

    private String retName;

    private String retAddress;

    private String retPic;

    public Integer getRetId() {
        return retId;
    }

    public void setRetId(Integer retId) {
        this.retId = retId;
    }

    public String getRetName() {
        return retName;
    }

    public void setRetName(String retName) {
        this.retName = retName == null ? null : retName.trim();
    }

    public String getRetAddress() {
        return retAddress;
    }

    public void setRetAddress(String retAddress) {
        this.retAddress = retAddress == null ? null : retAddress.trim();
    }

    public String getRetPic() {
        return retPic;
    }

    public void setRetPic(String retPic) {
        this.retPic = retPic == null ? null : retPic.trim();
    }
}