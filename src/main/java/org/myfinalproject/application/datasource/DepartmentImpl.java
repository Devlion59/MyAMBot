package org.myfinalproject.application.datasource;

import java.util.ArrayList;
import java.util.List;

public class DepartmentImpl {

    private String dptName;
    private List<EmployeeImpl> emploees;
    private List<FieldImpl> fields;

    public DepartmentImpl(String dptName) {
        this.dptName = dptName;
        emploees = new ArrayList<>();
        fields = new ArrayList<>();
    }

    public String getDptName() {
        return dptName;
    }
}
