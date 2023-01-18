package lt.sigito.cityTable.Repository;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "city")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {

    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "CountryCode")
    private String countryCode;
    @Column(name = "District")
    private String district;
    @Column(name = "Population")
    private Integer population;

}





