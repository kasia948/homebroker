package com.homebroker.demo;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Nazwa nie może być pusta")
    private String name;
    private String logoURL;
    @Min(10)
    private String description;

    @OneToOne
    @JoinColumn(name="investment_id", referencedColumnName = "id")
    private DeveloperDetails developerDetails;

    @OneToMany
    @JoinColumn(name="developer_id", referencedColumnName = "id")
    private List<Investment> investments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeveloperDetails getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(DeveloperDetails developerDetails) {
        this.developerDetails = developerDetails;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }
}
