package com.example.angular_spring_crud.Services;

import java.util.Collection;

import com.example.angular_spring_crud.Serveur.Serveur;

public interface ServerService {
    
    Serveur create(Serveur serveur);
    Serveur ping(String ipAddress);
    Collection<Serveur> List(int limit);
    Serveur get(Long id);
    Serveur update(Serveur serveur);
    Boolean delete(Long id);
}
