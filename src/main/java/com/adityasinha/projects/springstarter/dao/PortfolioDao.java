package com.adityasinha.projects.springstarter.dao;

public interface PortfolioDao {

    /** checks the health of database. 
     * @return true or false
     */
    default Boolean getDatabaseHealth(){
        return Boolean.FALSE;
    }
}
