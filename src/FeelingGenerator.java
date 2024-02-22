import java.util.Random;

class FeelingGenerator {
    private Random random;

    public FeelingGenerator() {
        this.random = new Random();
    }

    public ObjectState generateRandomState() {
        int randomIndex = random.nextInt(ObjectState.values().length);
        return ObjectState.values()[randomIndex];
    }
}