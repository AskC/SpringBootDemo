//package com.example.jpa.dao;
//
//import com.example.jpa.entity.Employee;
//import jakarta.persistence.EntityManager;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class EmployeeDAOHibernateImpl implements EmployeeDAO {
//
//    private EntityManager entityManager;
//
//    @Autowired
//    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        Session currentSession = entityManager.unwrap(Session.class);
//
//        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
//
//        return query.getResultList();
//    }
//}
