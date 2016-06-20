package com.example;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by minlee on 6/17/16.
 */
@Entity
public class Otter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OTTER_ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CUTENESS_LEVEL")
    private Double cutenessLevel;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLAM_ID")
    private Set<Clam> clams;

    //model that describe object
    //controller that dictates how to interact with the object

    public void swim(){
        cutenessLevel++;
    }

    public void crackClamOnMyTummy(){
        cutenessLevel+=2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCutenessLevel() {
        return cutenessLevel;
    }

    public void setCutenessLevel(Double cutenessLevel) {
        this.cutenessLevel = cutenessLevel;
    }

    public Set<Clam> getClams() {
        return clams;
    }

    public void setClams(Set<Clam> clams) {
        this.clams = clams;
    }
}
