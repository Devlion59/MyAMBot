package org.myfinalproject.application.datasource;

public class FacilityImpl {

    private String fctName;
    private FieldImpl field;

    public FacilityImpl(String fctName, FieldImpl field) {
        this.fctName = fctName;
        this.field = field;
    }

    public String getFctName() {
        return fctName;
    }

    public FieldImpl getField() {
        return field;
    }
}
