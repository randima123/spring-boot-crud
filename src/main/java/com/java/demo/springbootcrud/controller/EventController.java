//package com.java.demo.springbootcrud.controller;
//
//import com.java.demo.springbootcrud.model.Event;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.java.demo.springbootcrud.service.EventService;
//
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//public class EventController {
//
//    @Autowired
//    EventService eventService;
//
//    @GetMapping("/events")
//    public List<Event> getAllEvents() {
//        return eventService.getAllEvents();
//    }
//
//    @PostMapping("/events")
//    public Event saveEvent(@RequestBody Event event) {
//        System.out.println(event);
//        Event savedEvent = eventService.saveEvent(event);
//        return savedEvent;
//    }
//
//    @PutMapping("/events/{id}")
//    public Event updateEvent(@PathVariable Long id, @RequestBody Event event) {
//        Event updateEvent = eventService.updateEvent(id, event);
//        return updateEvent;
//    }
//}
