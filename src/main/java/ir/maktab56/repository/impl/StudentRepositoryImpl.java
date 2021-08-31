package ir.maktab56.repository.impl;

import ir.maktab56.base.repository.impl.BaseRepositoryImpl;
import ir.maktab56.domain.Student;
import ir.maktab56.repository.StudentRepository;

import javax.persistence.EntityManager;

public class StudentRepositoryImpl extends BaseRepositoryImpl<Student, Long> implements StudentRepository {
    public StudentRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Student> getEntityClass() {
        return Student.class;
    }
}
