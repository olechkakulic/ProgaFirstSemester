package olechka.lab4.interfaces;

import olechka.lab4.exception.PushableAlreadyPushedException;

public interface Pushable {
    void push() throws PushableAlreadyPushedException;
}
