package olechka.lab4.exception;

import olechka.lab4.PhysicalObject;

public class PushableAlreadyPushedException extends Exception {
    public PushableAlreadyPushedException(PhysicalObject object) {
        super("The object " + object + " has already pushed");
    }
}
