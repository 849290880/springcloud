package com.hai.pojo;

public class Dept {
    private Integer deptNo;

    private String deptName;

    private String dbSource;

    /**
     * @return dept_no
     */
    public Integer getDeptNo() {
        return deptNo;
    }

    /**
     * @param deptNo
     */
    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    /**
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return db_source
     */
    public String getDbSource() {
        return dbSource;
    }

    /**
     * @param dbSource
     */
    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}