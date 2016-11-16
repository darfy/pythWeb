package main.provider;

import main.provider.model.Floor;

import java.util.List;

/**
 * Created by mikaelnaas on 15/11/16.
 */
public interface FloorProvider {
    void addFloor(Floor floor);
    void removeFloor(Floor floor);
    void removeFloor(int id);
    Floor getFloor(int id);
    List<Floor> getFloors();
}
