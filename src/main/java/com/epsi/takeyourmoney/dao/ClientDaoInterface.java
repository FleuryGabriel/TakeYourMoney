/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epsi.takeyourmoney.dao;

import com.epsi.takeyourmoney.entities.Client;
import java.util.List;

/**
 *
 * @author Fleury Gabriel
 */
public interface ClientDaoInterface {
    
    public int addClient(Client cIn);
    public Client findClientById(int id);
    public List<Client> getAllClient();
    public int updateClient(Client cIn, int id);
    public int deleteClientById(int id);
    
}
