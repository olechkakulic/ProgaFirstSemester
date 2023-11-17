package olechka.lab3.human;

public enum HumanSense {
    NORMAL("нормич"), LITTLE_ASTONISHED("немножко удивлен"), ASTONISHED("удивлен"), STRONGLY_ASTONISHED("удивлен посильнее"), ASTONISHED_SO_MUCH("уже просто в полном ахуе");

    private final String state;

    HumanSense(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
