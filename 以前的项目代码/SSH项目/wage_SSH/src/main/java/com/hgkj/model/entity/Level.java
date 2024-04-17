package com.hgkj.model.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Level {
    private int levelId;
    private String levelName;
    private BigDecimal levelPrice;
    /*员工信息表*/
private Set<Staffinfo> staffinfoSet=new HashSet <>();

    public Set <Staffinfo> getStaffinfoSet() {
        return staffinfoSet;
    }

    public void setStaffinfoSet(Set <Staffinfo> staffinfoSet) {
        this.staffinfoSet = staffinfoSet;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public BigDecimal getLevelPrice() {
        return levelPrice;
    }

    public void setLevelPrice(BigDecimal levelPrice) {
        this.levelPrice = levelPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Level level = (Level) o;

        if (levelId != level.levelId) return false;
        if (levelName != null ? !levelName.equals(level.levelName) : level.levelName != null) return false;
        if (levelPrice != null ? !levelPrice.equals(level.levelPrice) : level.levelPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelId;
        result = 31 * result + (levelName != null ? levelName.hashCode() : 0);
        result = 31 * result + (levelPrice != null ? levelPrice.hashCode() : 0);
        return result;
    }
}
