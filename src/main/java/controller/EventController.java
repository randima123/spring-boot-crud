package controller;

import model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EventService;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/event")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
