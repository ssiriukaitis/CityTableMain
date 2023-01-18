package lt.sigito.cityTable.Service;

import lt.sigito.cityTable.Repository.City;
import lt.sigito.cityTable.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCities(){
        return (List<City>) cityRepository.findAll();
    }
}
