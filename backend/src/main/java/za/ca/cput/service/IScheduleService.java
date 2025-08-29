package za.ca.cput.service;

import za.ca.cput.domain.Schedule;

import java.util.List;

public interface IScheduleService extends IService<Schedule, Long>{
    List<Schedule> getAll();
}
