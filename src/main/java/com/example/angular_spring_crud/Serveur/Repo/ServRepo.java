package com.example.angular_spring_crud.Serveur.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.angular_spring_crud.Serveur.Serveur;

public interface ServRepo extends JpaRepository<Serveur, Long> {
    Serveur findByIpAddress(String ipAddress);
    Serveur findByName(String name);

}
