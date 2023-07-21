package com.aligunes;

import com.aligunes.model.Customer;
import com.aligunes.model.CustomerDetail;
import com.aligunes.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.Date;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setTitle("MSc.Computer Engineer");
        customer.setFirstname("Burak");
        customer.setLastname("Delice");


        CustomerDetail customerDetail = new CustomerDetail();
        customerDetail.setAddress("Ankara");
        customerDetail.setPhone("555");
        customerDetail.setCreationDate(new Date());
        customerDetail.setCustomer(customer);
        customer.setCustomerDetail(customerDetail);


        Customer customer2 = new Customer("Dr.", "Engin", "Ertikmen");

        CustomerDetail customerDetail2 = new CustomerDetail("Adana", "555" ,new Date());
        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);

        Session session= HibernateUtil.getSessionFactory().openSession();

        Transaction transaction=null;

        try {

            transaction = session.beginTransaction();
            //  session.save(customer);
            //  session.save(customer2);
            Query query = session.createQuery("from Customer");
            List<Customer> customerList = query.list();
            for (Customer c:customerList
            ) {
                System.out.println(c.getTitle()+" " +c.getFirstname()+" "+ c.getLastname());

            }
            System.out.println("================================");
            Query query2 = session.createQuery("from Customer where id=:id");
            query2.setLong("id",1);
            Customer customerDemo =(Customer) query2.uniqueResult();
            System.out.println(customerDemo.getTitle()+" " +customerDemo.getFirstname()+" "+ customerDemo.getLastname());

            System.out.println("============  update  ============");
            query = session.createQuery("update Customer set title=:title, firstname=:first_name," +
                    " lastname=:last_name where id=:id");

            query.setParameter("title","Doc.");
            query.setParameter("first_name","Aminenur");
            query.setParameter("last_name","Göynük");
            query.setLong("id",1);
            int result = query.executeUpdate();
            System.out.println("update sorgu sonucu " +result);


            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Hata: " + e);

        } finally {
            session.close();
        }



    }
}