package com.example.labo1.core.repository.abstraction;

import com.example.labo1.core.base.Event;

import java.util.ArrayList;
import java.util.List;

public interface IEventRepository {
    void save(Event event);
    List<Event> getAll();
}
