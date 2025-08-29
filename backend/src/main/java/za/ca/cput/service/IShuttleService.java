package za.ca.cput.service;

import za.ca.cput.domain.Shuttle;

import java.util.List;

public interface IShuttleService extends IService<Shuttle, Long>{
    List<Shuttle> getAllShuttle();
}