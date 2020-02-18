package com.bazalytskyi.hw2_distribured.entity.nosql;

import javax.persistence.Id;
import java.util.Objects;

public class UserNoSql {
    @Id
    private String id;
    private String login;
    private String password;
    private CurriculumVitaeNoSql cv;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CurriculumVitaeNoSql getCv() {
        return cv;
    }

    public void setCv(CurriculumVitaeNoSql cv) {
        this.cv = cv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserNoSql user = (UserNoSql) o;
        return id == user.id &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password);
    }

    @Override
    public String toString() {
        return "UserNoSql{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", cv=" + cv +
                '}';
    }
}



