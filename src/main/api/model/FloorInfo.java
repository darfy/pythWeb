package main.api.model;

/**
 * Created by mikaelnaas on 15/11/16.
 */
public class FloorInfo {


    private String floorName;
    private String buildingName;
    private int area;

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
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
