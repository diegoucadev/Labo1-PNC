package com.example.labo1.core.repository;

import com.example.labo1.core.base.Event;
import com.example.labo1.core.repository.abstraction.IEventRepository;

import java.util.ArrayList;
import java.util.List;

public class EventRepositoryImpl implements IEventRepository {
    public static List<Event> eventInMemoryDB = new ArrayList<>();
    public static int eventCount = 0;

    public EventRepositoryImpl() {}

    @Override
    public void save(Event event) {
        eventInMemoryDB.add(event);
    }

    @Override
    public List<Event> getAll() {
        return eventInMemoryDB;
    }
}
