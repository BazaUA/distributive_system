package com.bazalytskyi.hw2_distribured.entity.nosql;

public class CurriculumVitaeNoSql {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CurriculumVitaeNoSql{" +
                "data='" + data + '\'' +
                '}';
    }
}
