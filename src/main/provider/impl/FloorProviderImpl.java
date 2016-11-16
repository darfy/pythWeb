package main.provider.impl;

import main.util.HibernateUtil;
import main.provider.FloorProvider;
import main.provider.model.Floor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaelnaas on 15/11/16.
 */
public class FloorProviderImpl implements FloorProvider {
    public void addFloor(Floor floor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(floor);
        transaction.commit();
        session.close();
    }

    public void removeFloor(Floor floor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(floor);
        transaction.commit();
        session.close();

    }

    //TODO implement removeFloor(int id)
    public void removeFloor(int id) {

    }

    //TODO implement getFloor(int id)
    public Floor getFloor(int id) {
        return null;
    }

    public List<Floor> getFloors() {
        List<Floor> floorList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Floor ");
        floorList = query.list();
        return floorList;
    }
}
