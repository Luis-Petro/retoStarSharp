package com.choucair.model;

public class BusinessUnitData {
    private String nameBusinessUnit;
    private String parentUnit;

    public String getParentUnit() {
        return parentUnit;
    }

    public void setParentUnit(String parentUnit) {
        this.parentUnit = parentUnit;
    }

    public String getNameBusinessUnit() {
        return nameBusinessUnit;
    }
    public void setNameBusinessUnit(String nameBusinessUnit) {
        this.nameBusinessUnit = nameBusinessUnit;
    }
}
