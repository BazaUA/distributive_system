package com.bazalytskyi.hw2_distribured.entity.sql;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String data;
    @OneToOne(mappedBy = "cv")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurriculumVitae that = (CurriculumVitae) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(data, that.data) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, user);
    }

    @Override
    public String toString() {
        return "CurriculumVitae{" +
                "id=" + id +
                ", data='" + data + '\'' +
                '}';
    }
}
