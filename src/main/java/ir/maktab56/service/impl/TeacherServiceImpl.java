package ir.maktab56.service.impl;

import ir.maktab56.base.service.impl.BaseServiceImpl;
import ir.maktab56.domain.Teacher;
import ir.maktab56.repository.TeacherRepository;
import ir.maktab56.service.TeacherService;

public class TeacherServiceImpl extends BaseServiceImpl<Teacher, Long, TeacherRepository> implements TeacherService {
    public TeacherServiceImpl(TeacherRepository repository) {
        super(repository);
    }
}
