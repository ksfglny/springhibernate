package com.dao;

import com.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/*
*@ClassName:StudentDao
 @Description:TODO
 @Author:
 @Date:2018/9/12 17:58 
 @Version:v1.0
*/
@Repository
public class StudentDao {
    @Autowired
    HibernateTemplate hibernateTemplate;

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        System.out.println("helllo");
        studentDao.get(1);
    }


    public StudentEntity get(int id){
        StudentEntity studentEntity = hibernateTemplate.get(StudentEntity.class, id);
        return studentEntity;
    }
}
