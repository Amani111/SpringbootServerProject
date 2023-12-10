package com.example.angular_spring_crud.Services.implementation;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.angular_spring_crud.Serveur.Serveur;
import com.example.angular_spring_crud.Serveur.Repo.ServRepo;
import com.example.angular_spring_crud.Services.ServerService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServerServiceImplementation implements ServerService {

    private final ServRepo ServRepo;

    @Override
    public Serveur create(Serveur serveur) {
        log.info("Saving new server,{}", serveur.getName());
        serveur.setImageUrl(SetServImageUrl());
        return ServRepo.save(serveur);
    }

    @Override
    public Serveur ping(string ipAddress) throws IOException{
        log.info("Pinging server IP ,{}", ipAddress);
        Serveur serveur = ServRepo.findByIpAddress(ipAddress);
       InetAddress address= InetAddress.getByName(ipAddress);
       serveur.setIpAddress(address.isReachable(timeout:10000) ? SERVER_UP : SERVER_DOWN);
       ServRepo.save(serveur);
        return serveur;
    }

    @Override
    Collection<Serveur> list(int limit) {

        log.info("fetching all server");
        return ServRepo.findAll(PageRequest.of(page : 0,limit)).tolist();
    }

    @Override
    // get serveur
    public Serveur get(Long id) {

        log.info("fetching  server by id :{}", id);
        return ServRepo.findById(id).get();
    }

    @Override
    public Serveur update(Serveur serveur) {
        log.info("update  server,{}", serveur.getName());
        return ServRepo.save(serveur);
    }

    @Override
    public Boolean delete(Long id) {
        log.info("deleting server by id :{}", id);
        ServRepo.deleteById(id);
        return true;
    }

    private String SetServImageUrl() throws Exception {

        return null;
    }


}
