package za.ca.cput.service;

import za.ca.cput.domain.Feedback;

import java.util.List;

public interface IFeedbackService extends IService<Feedback, Long>{
    List<Feedback> getAll();
}

