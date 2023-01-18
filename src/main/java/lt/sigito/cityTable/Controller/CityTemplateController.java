package lt.sigito.cityTable.Controller;

import lt.sigito.cityTable.Repository.City;
import lt.sigito.cityTable.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/citytemplate" )
public class CityTemplateController {

    @Autowired
    private CityService cityService;

    //http://localhost:8080/citytemplate/test
    @GetMapping(path = "/test")
    public String getTestpage(){
        return "/HomeHTML";
    }
    //http://localhost:8080/citytemplate/firstpage/city/64
    @GetMapping(path = "/firstpage/city/{id}" )
    public String getCityWithFirstPage(Model model, @PathVariable int id) {

        City city = cityService.getMyCityById(id);

        model.addAttribute("id", city.getId());
        model.addAttribute("name", city.getName());
        model.addAttribute("country_code", city.getCountryCode());
        model.addAttribute("district", city.getDistrict());
        model.addAttribute("population", city.getPopulation());



        return "/firstpage";
    }

    //http://localhost:8080/citytemplate/firstpage/city/all
    @GetMapping(path = "/firstpage/city/all" )
    public String getAllCustomers(Model model) {
        List<City> citiesList = cityService.getAllCities();
        model.addAttribute("cities_list", citiesList);
        return "/firstpage_Cities_List";
    }
}
