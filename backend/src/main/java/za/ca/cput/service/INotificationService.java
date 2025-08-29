package za.ca.cput.service;

import za.ca.cput.domain.Notifications;

import java.util.List;


public interface INotificationService extends IService<Notifications, Long>{
    List<Notifications> getAll();
}