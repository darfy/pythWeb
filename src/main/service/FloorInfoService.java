package main.service;

import main.api.model.FloorInfo;

import java.util.List;

/**
 * Created by mikaelnaas on 15/11/16.
 */
public interface FloorInfoService {
    List<FloorInfo> getFloorsInfo();
}
