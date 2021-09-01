package ir.maktab56.domain;

import ir.maktab56.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student extends BaseEntity<Long> {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "student_code", nullable = false, length = 10, unique = true)
    private String studentCode;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Column(name = "birthday")
    private Date birthday;

    @OneToMany(mappedBy = "student")
    private Set<Address> addresses = new HashSet<>();

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

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
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

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Student(){
    }

    public Student(String firstName, String lastName, String studentCode, Date birthday,Set<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCode = studentCode;
        this.birthday = birthday;
        this.addresses = addresses;
    }
}
