package com.company.Observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface Subject {
    static Map<Observer, Subject> map = new HashMap<>();
    static Subject get(Observer x) {
        return map.get(x);
    }

    default void insert(Observer x){
        map.put(x, this);
    }

    default void remove(Observer x) {
        map.remove(x);
    }

    default void notifyObservers() {
        Set<Map.Entry<Observer, Subject>> hashSet = map.entrySet();
        for (Map.Entry e : hashSet) {
            if(e.getValue() == this) {
                ((Observer)e.getKey()).update();
            }
        }
    }

    default void notifyAllObservers() {
        Set<Map.Entry<Observer, Subject>> hashSet = map.entrySet();
        for (Map.Entry e : hashSet) {
            ((Observer)e.getKey()).update();
        }
    }
}
