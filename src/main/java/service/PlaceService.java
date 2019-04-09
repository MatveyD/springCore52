package service;

import Model.Place;
import java.util.List;

public interface PlaceService {

    Place getByName(String name);

    List<Place> getAll();

}
