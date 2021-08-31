package ir.maktab56.service.impl;

import ir.maktab56.base.repository.BaseRepository;
import ir.maktab56.base.service.impl.BaseServiceImpl;
import ir.maktab56.domain.Student;
import ir.maktab56.repository.StudentRepository;
import ir.maktab56.service.StudentService;

public class StudentServiceImpl extends BaseServiceImpl<Student, Long, StudentRepository> implements StudentService {
    public StudentServiceImpl(StudentRepository repository) {
        super(repository);
    }
}
