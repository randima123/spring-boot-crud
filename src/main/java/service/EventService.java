package service;

import model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EventRepository;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
