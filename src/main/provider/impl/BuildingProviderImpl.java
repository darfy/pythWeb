package main.provider.impl;

import main.util.HibernateUtil;
import main.provider.BuildingProvider;
import main.provider.model.Building;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaelnaas on 15/11/16.
 */
public class BuildingProviderImpl implements BuildingProvider {

    public void addBuilding(Building building) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(building);
        transaction.commit();
        session.close();
    }

    public void removeBuilding(Building building) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(building);
        transaction.commit();
        session.close();
    }

    //TODO Implement removeBuilding(int id)
    public void removeBuilding(int id) {

    }

    //TODO Implement getBuilding(int id)
    public Building getBuilding(int id) {
        return null;
    }

    public List<Building> getBuildings() {
        List<Building> buildingList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Building ");
        buildingList = query.list();
        return buildingList;
    }
}
