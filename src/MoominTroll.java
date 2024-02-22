class MoominTroll extends Character {
    private ObjectState state;

    public MoominTroll(String name, ObjectState state) {
        super(name);
        this.state = state;
    }

    public ObjectState getState() {
        return state;
    }

    public void setState(ObjectState state) {
        this.state = state;
    }

    @Override
    public void interact() {
        switch (state) {
            case GOOD:
                System.out.println(getName() + " чувствует себя прекрасно.");
                break;
            case CONFUSED:
                System.out.println(getName() + " в растерянности.");
                break;
            case BAD:
                System.out.println(getName() + " чувствует себя плохо. ");
                break;
            case FORGOTTEN:
                System.out.println(getName() + " все забыл. ");
        }
    }

    @Override
    public void speak() {
        System.out.println(getName() + " говорит что-то важное.");
    }

    @Override
    public String toString() {
        return "MoominTroll{" +
                "name='" + getName() + '\'' +
                ", state=" + state +
                '}';
    }
}