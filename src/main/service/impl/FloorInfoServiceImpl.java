package main.service.impl;

import main.api.model.FloorInfo;
import main.provider.BuildingProvider;
import main.provider.FloorProvider;
import main.provider.impl.BuildingProviderImpl;
import main.provider.impl.FloorProviderImpl;
import main.provider.model.Building;
import main.service.FloorInfoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaelnaas on 15/11/16.
 */
public class FloorInfoServiceImpl implements FloorInfoService {
    private BuildingProvider buildingProvider = new BuildingProviderImpl();
    private FloorProvider floorProvider = new FloorProviderImpl();

    public List<FloorInfo> getFloorsInfo() {
        List<Building> buildings = buildingProvider.getBuildings();
        List<FloorInfo> floorInfos = new ArrayList<FloorInfo>();

        for (int i = 0; i < buildings.size(); i++) {
            for (int j = 0; j < buildings.get(i).getFloors().size(); j++) {
             FloorInfo floorInfo = new FloorInfo();
                floorInfo.setBuildingName(buildings.get(i).getBuildingName());
                floorInfo.setFloorName(buildings.get(i).getFloors().get(j).getFloorName());
                floorInfo.setArea(buildings.get(i).getFloors().get(j).getArea());
                floorInfos.add(floorInfo);
            }
        }
        return floorInfos;

    }
}
