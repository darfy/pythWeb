package main.util;

import main.provider.model.Building;
import main.provider.model.Floor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A utility class that populates the database, not to be included in deployment
 * Could be used for testing in the future
 *
 * Created by mikaelnaas on 09/11/16.
 */
public class Populator {

    public void populate(SessionFactory sessionFactory){

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Building buildingA = new Building();
        Building buildingB = new Building();

        buildingA.setBuildingName("BuildingA");
        buildingB.setBuildingName("BuildingB");

        Floor floorA1 = new Floor();
        Floor floorA2 = new Floor();

        Floor floorB1 = new Floor();
        Floor floorB2 = new Floor();
        Floor floorB3 = new Floor();


        floorA1.setFloorName("FloorA1");
        floorA2.setFloorName("FloorA2");
        floorA1.setArea(new Random().nextInt(6000));
        floorA2.setArea(new Random().nextInt(6000));

        floorB1.setFloorName("FloorB1");
        floorB2.setFloorName("FloorB2");
        floorB3.setFloorName("FloorB3");

        floorB1.setArea(new Random().nextInt(6000));
        floorB2.setArea(new Random().nextInt(6000));
        floorB3.setArea(new Random().nextInt(6000));

        List<Floor> floorsInABuilding = new ArrayList<Floor>();
        floorsInABuilding.add(floorA1);
        floorsInABuilding.add(floorA2);



        List<Floor> floorsInBBuilding = new ArrayList<Floor>();
        floorsInBBuilding.add(floorB1);
        floorsInBBuilding.add(floorB2);
        floorsInBBuilding.add(floorB3);

        buildingA.setFloors(floorsInABuilding);
        buildingB.setFloors(floorsInBBuilding);

        session.save(buildingA);
        session.save(buildingB);

        session.getTransaction().commit();

        session.close();

    }
}
