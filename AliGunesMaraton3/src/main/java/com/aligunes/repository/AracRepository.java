package com.aligunes.repository;

import com.aligunes.entity.Arac;
import com.aligunes.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AracRepository {



    public Arac aracOlustur(Arac arac) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.save(arac);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return arac;
    }

    public Arac aracAraById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("ARAÇ DURUMU: " +session.get(Arac.class, id));
            return session.get(Arac.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //duruma göre hql sorgusu
    public List<Arac> kiradakiAraclar() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Arac WHERE durum = 'KIRADA'", Arac.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    //duruma göre hql sorgusu
    public List<Arac> musaitAraclar() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Arac WHERE durum = 'MUSAIT'", Arac.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
