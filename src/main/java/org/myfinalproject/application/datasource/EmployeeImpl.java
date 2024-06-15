package org.myfinalproject.application.datasource;

public class EmployeeImpl {

    private String emplName;
    private String position;
    private String email;
    private String telephoneNumber;
    private String address;
    private DepartmentImpl department;

    public EmployeeImpl(String emplName, String position, String email,
                        String telephoneNumber, String address, DepartmentImpl department) {
        this.emplName = emplName;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.department = department;
    }

    public String getEmplName() {
        return emplName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public DepartmentImpl getDepartment() {
        return department;
    }
}
