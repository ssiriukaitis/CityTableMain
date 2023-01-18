package lt.sigito.cityTable.BootStrap;

import lt.sigito.cityTable.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private CityRepository cityRepository;


    @Override
    public void run(String... args) throws Exception {

        cityRepository.findAll().forEach(System.out::println);
        System.out.println("------------------");
        System.out.println(cityRepository.findById(64));

    }
}
