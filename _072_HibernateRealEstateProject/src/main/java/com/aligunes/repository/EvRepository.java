package com.aligunes.repository;

import com.aligunes.model.Ev;

import javax.persistence.TypedQuery;
import java.util.List;

public class EvRepository {

    public List<Ev> kiradaOlanEvler(){

        String hql = "select * from Ev e where e.durum=:STATUS";
        TypedQuery <Ev> typedQuery = Hibernate


        return null;
    }

}
