package org.myfinalproject.application.context;

import org.myfinalproject.application.datasource.DepartmentImpl;

import java.util.HashMap;
import java.util.Map;

public interface Context {

    static Context getInstance() {
        return new ContextDefaultImpl();
    }
}

class ContextDefaultImpl implements Context {

    private final Map<String, DepartmentImpl> context;

    public ContextDefaultImpl() {
        this.context = new HashMap<>();
        createDepartment();


    }

    private void createDepartment() {
        DepartmentImpl dept = new DepartmentImpl("АУП");
        addDepartmentToMap(dept);
        dept = new DepartmentImpl("ТПП Чернушканефтегаз");
        addDepartmentToMap(dept);
        dept = new DepartmentImpl("ТПП Полазнанефтегаз");
        addDepartmentToMap(dept);
        for (int i = 1; i < 13; i++) {
            StringBuilder name = new StringBuilder();
            name.append("ЦДНГ-").append(i);
            dept = new DepartmentImpl(name.toString());
            addDepartmentToMap(dept);
        }
    }

    private void addDepartmentToMap(DepartmentImpl dept) {
        context.put(dept.getDptName(), dept);
    }
}
