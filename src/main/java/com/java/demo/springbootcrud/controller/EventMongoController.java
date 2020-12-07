package com.java.demo.springbootcrud.controller;

import com.java.demo.springbootcrud.model.EventMongo;
import com.java.demo.springbootcrud.service.EventMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventMongoController {

    @Autowired
    EventMongoService eventService;

    @GetMapping("/events")
    public List<EventMongo> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("/events")
    public EventMongo saveEvent(@RequestBody EventMongo event) {
        System.out.println(event);
        EventMongo savedEvent = eventService.saveEvent(event);
        return savedEvent;
    }

    @PutMapping("/events/{id}")
    public EventMongo updateEvent(@PathVariable String id, @RequestBody EventMongo event) {
        EventMongo updateEvent = eventService.updateEvent(id, event);
        return updateEvent;
    }

    @GetMapping("/events/{id}")
    public EventMongo getEventById(@PathVariable String id) {
        EventMongo event = eventService.getEventById(id);
        return event;
    }
}
