package main.provider.model;

import javax.persistence.*;

/**
 * Created by mikaelnaas on 09/11/16.
 */
@Entity
public class Floor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="area")
    private int area;

    @Column(name="floorName")
    private String floorName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


}
