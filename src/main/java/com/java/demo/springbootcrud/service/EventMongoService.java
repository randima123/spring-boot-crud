package com.java.demo.springbootcrud.service;

import com.java.demo.springbootcrud.model.EventMongo;
import com.java.demo.springbootcrud.repository.EventMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EventMongoService {

    @Autowired
    EventMongoRepository eventRepository;

    public List<EventMongo> getAllEvents() {
        return eventRepository.findAll();
    }

    public EventMongo saveEvent(EventMongo event) {
        System.out.println(event);
        EventMongo savedEvent = eventRepository.insert(event);
        return savedEvent;
    }

    public EventMongo updateEvent(String eventId, EventMongo newEvent) {
        return eventRepository.findById(eventId)
                .map(event -> {
                    event.setTransId(newEvent.getTransId());
                    event.setTransTms(newEvent.getTransTms());
                    event.setRcNum(newEvent.getRcNum());
                    event.setClientId(newEvent.getClientId());
                    event.setEventCnt(newEvent.getEventCnt());
                    event.setLocationCd(newEvent.getLocationCd());
                    event.setLocationId1(newEvent.getLocationId1());
                    event.setLocationId2(newEvent.getLocationId2());
                    event.setAddrNbr(newEvent.getAddrNbr());
                    System.out.println(event);
                    return eventRepository.save(event);
                })
                .orElseGet(() -> {
                    newEvent.setEventId(eventId);
                    return eventRepository.save(newEvent);
                });
    }

    public EventMongo getEventById(String eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(() -> new EntityNotFoundException(eventId));
    }
}
