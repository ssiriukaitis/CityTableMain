package lt.sigito.cityTable.Controller;

import lt.sigito.cityTable.Repository.City;
import lt.sigito.cityTable.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller// https://localhost:3306//
@RequestMapping(path = "/citymapping" )
public class CityController {

    @Autowired
    private CityService cityService;

    //http://localhost:8080/citymapping/test
    @GetMapping(path = "/test")
    public @ResponseBody String getTestPage() {
        return "This is text from City Spring";
    }
    ////http://localhost:8080/citymapping/city/all
    @GetMapping(path = "/city/all")
    public @ResponseBody List<City> getAllCities(){
        return cityService.getAllCities();

    }
    ////http://localhost:8080/citymapping/city/64
    @GetMapping(path = "/city/{id}")
    public @ResponseBody City getCityById(@PathVariable int id){
        return cityService.getCityById(id);
    }
}
