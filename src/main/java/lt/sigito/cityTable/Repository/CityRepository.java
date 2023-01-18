package lt.sigito.cityTable.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CityRepository extends CrudRepository<City, Integer> {


    Optional<City> findById(int id);
    Iterable<City> findByNameLike (String name);
}
