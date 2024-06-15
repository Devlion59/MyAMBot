package org.myfinalproject.application.datasource;

import java.util.ArrayList;
import java.util.List;

public class FieldImpl {

    private String fieldName;
    private String nddInformation;
    private DepartmentImpl department;
    private List<FacilityImpl> facilities;

    public FieldImpl(String fieldName, String nddInformation, DepartmentImpl department) {
        this.fieldName = fieldName;
        this.nddInformation = nddInformation;
        this.department = department;
        facilities = new ArrayList<>();
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getNddInformation() {
        return nddInformation;
    }

    public DepartmentImpl getDepartment() {
        return department;
    }
}
