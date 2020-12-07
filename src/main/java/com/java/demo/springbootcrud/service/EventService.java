//package com.java.demo.springbootcrud.service;
//
//import com.java.demo.springbootcrud.model.Event;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.java.demo.springbootcrud.repository.EventRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EventService {
//
//    @Autowired
//    EventRepository eventRepository;
//
//    public List<Event> getAllEvents() {
//        return eventRepository.findAll();
//    }
//
//    public Event saveEvent(Event event) {
//        System.out.println(event);
//        Event savedEvent = eventRepository.save(event);
//        return savedEvent;
//    }
//
//    public Event updateEvent(Long eventId, Event newEvent) {
//        return eventRepository.findById(eventId)
//                .map(event -> {
//                    event.setTransId(newEvent.getTransId());
//                    event.setTransTms(newEvent.getTransTms());
//                    event.setRcNum(newEvent.getRcNum());
//                    event.setClientId(newEvent.getClientId());
//                    event.setEventCnt(newEvent.getEventCnt());
//                    event.setLocationCd(newEvent.getLocationCd());
//                    event.setLocationId1(newEvent.getLocationId1());
//                    event.setLocationId2(newEvent.getLocationId2());
//                    event.setAddrNbr(newEvent.getAddrNbr());
//                    System.out.println(event);
//                    return eventRepository.save(event);
//                })
//                .orElseGet(() -> {
//                    newEvent.setEventId(eventId);
//                    return eventRepository.save(newEvent);
//                });
//    }
//}
