package za.ca.cput.service;

import za.ca.cput.domain.ShuttleOperator;

import java.util.List;

public interface IShuttleOperatorService extends IService<ShuttleOperator, Long>{
    List<ShuttleOperator> getAll();
}


