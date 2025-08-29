package za.ca.cput.service;

import org.springframework.stereotype.Service;
import za.ca.cput.domain.Admin;

import java.util.List;


public interface IAdminService extends IService<Admin, Long>{
    List<Admin> getAll();
}
