class InvalidAnimalSpeciesException extends Exception {
    public InvalidAnimalSpeciesException(String species) {
        super("Недопустимый вид животного: " + species);
    }
}