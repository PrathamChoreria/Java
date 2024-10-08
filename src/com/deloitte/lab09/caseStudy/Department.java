package com.deloitte.lab09.caseStudy;

public class Department {
    private Integer departmentId;
    private String departmentName;
    private Integer managerId;


    public Department(Integer departmentId, String departmentName, Integer managerId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerId = managerId;
    }

    public Integer getDepartmentId() { return departmentId; }
    public String getDepartmentName() { return departmentName; }
    public Integer getManagerId() { return managerId; }

    public void setDepartmentId(Integer departmentId) { this.departmentId = departmentId; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public void setManagerId(Integer managerId) { this.managerId = managerId; }
}
