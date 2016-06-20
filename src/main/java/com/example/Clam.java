package com.example;

import javax.persistence.*;

/**
 * Created by minlee on 6/17/16.
 */
@Entity
public class Clam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CLAM_ID")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
