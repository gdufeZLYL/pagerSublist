package com.zqx.page.service;

import com.zqx.page.dao.StudentDao;
import com.zqx.page.dao.SublistStudentDaoImpl;
import com.zqx.page.model.Pager;
import com.zqx.page.model.Student;

/**
 * Created by adc333 on 2017/2/18.
 */
public class SublistStudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public SublistStudentServiceImpl() {
        // 创建servivce实现类时，初始化dao对象。
        studentDao = new SublistStudentDaoImpl();
    }

    @Override
    public Pager<Student> findStudent(Student searchModel, int pageNum,
                                      int pageSize) {
        Pager<Student> result = studentDao.findStudent(searchModel, pageNum,
                pageSize);
        return result;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
