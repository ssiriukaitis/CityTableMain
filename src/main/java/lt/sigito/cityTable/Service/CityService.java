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
    public City getCityById(Integer cityId){
        return cityRepository.findById(cityId).get();
    }
    public City getMyCityById(int id){
        return cityRepository.findById(id).get();
    }
    public List<City> getMyCityByNameLike(String name){
        return (List<City>) cityRepository.findByNameLike(name);
    }
}
