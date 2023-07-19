package com.aligunes;

import com.aligunes.model.Customer;
import com.aligunes.model.CustomerDetail;
import com.aligunes.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

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

        try{

            transaction=session.beginTransaction();
            session.save(customer);
            session.save(customer2);
            transaction.commit();

        }catch(HibernateException e){
            transaction.rollback();
            System.out.println("Hata: "+e);
        }
        finally {
            session.close();
        }



    }
}