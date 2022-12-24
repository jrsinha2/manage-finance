package com.adityasinha.projects.managefinance.dao;

public interface PortfolioDao {

    /**
     * checks the health of database.
     *
     * @return true or false
     */
    default String getDatabaseHealth(){
        return null;
    }
}
