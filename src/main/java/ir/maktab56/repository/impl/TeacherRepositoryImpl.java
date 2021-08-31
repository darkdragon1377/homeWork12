package ir.maktab56.repository.impl;

import ir.maktab56.base.repository.BaseRepository;
import ir.maktab56.base.repository.impl.BaseRepositoryImpl;
import ir.maktab56.domain.Teacher;
import ir.maktab56.repository.TeacherRepository;

import javax.persistence.EntityManager;

public class TeacherRepositoryImpl extends BaseRepositoryImpl<Teacher, Long> implements TeacherRepository {
    public TeacherRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Teacher> getEntityClass() {
        return null;
    }
}