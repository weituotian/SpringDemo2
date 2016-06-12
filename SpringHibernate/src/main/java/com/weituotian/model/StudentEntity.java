package com.weituotian.model;

import javax.persistence.*;

/**
 * Created by ange on 2016/6/6.
 */
@Entity
@Table(name = "student", schema = "mydb", catalog = "")
public class StudentEntity {
    private int id;
    private String name;
    private ClazzEntity clazz;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "id", nullable = false)
    public ClazzEntity getClazz() {
        return clazz;
    }

    public void setClazz(ClazzEntity clazz) {
        this.clazz = clazz;
    }
}
