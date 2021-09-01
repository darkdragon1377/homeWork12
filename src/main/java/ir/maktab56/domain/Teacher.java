package ir.maktab56.domain;

import ir.maktab56.base.domain.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teacher")
public class Teacher extends BaseEntity<Long> {

    @Column (name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "teacher_code", nullable = false, length = 10, unique = true)
    private String teacherCode;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Column(name = "birthday")
    private Date birthday;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String teacherCode, Double salary, Date birthday, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacherCode = teacherCode;
        this.salary = salary;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
