package main.api;

import main.api.model.FloorInfo;
import main.service.FloorInfoService;
import main.service.impl.FloorInfoServiceImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/floorsInfo")
public class FloorsInfoEndpoint {
    FloorInfoService floorInfoService = new FloorInfoServiceImpl();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response floorResponse() {
        List<FloorInfo> floorInfos = new ArrayList();
        floorInfos = floorInfoService.getFloorsInfo();
        GenericEntity<List<FloorInfo>> entity = new GenericEntity<List<FloorInfo>>(floorInfos) {};
        return Response.ok(entity).build();

    }

}


