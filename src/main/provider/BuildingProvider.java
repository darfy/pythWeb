package main.provider;

import main.provider.model.Building;

import java.util.List;

/**
 * Created by mikaelnaas on 15/11/16.
 */
public interface BuildingProvider {
    void addBuilding(Building building);
    void removeBuilding(Building building);
    void removeBuilding(int id);
    Building getBuilding(int id);
    List<Building> getBuildings();

}
