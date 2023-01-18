package lt.sigito.cityTable.Controller;

import lt.sigito.cityTable.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
