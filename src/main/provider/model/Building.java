package main.provider.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mikaelnaas on 09/11/16.
 */
@Entity
public class Building {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="buildingName")
    private String buildingName;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="BUILDING_ID")
    private List<Floor> floors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }


    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

}
