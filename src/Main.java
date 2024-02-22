public class Main {
    public static void main(String[] args) throws InvalidAnimalSpeciesException {
        FeelingGenerator feelingGenerator = new FeelingGenerator();

        MoominTroll moomin = new MoominTroll("Муми-тролль", feelingGenerator.generateRandomState());
        MoominTroll emma = new MoominTroll("Эмма", feelingGenerator.generateRandomState());
        MoominTroll mom = new MoominTroll("Мама", ObjectState.GOOD);

        Animal smurfik = new Animal("Смурфик", "Голубые гномики");
        Thing stairs = new Thing("веревочная лестница");
        Place darkness = new Place("темнота");
        Thing tree = new Thing("зеленая крона дерева");
        Thing broom = new Thing("метла");
        Character.RecipeBook recipeBook = new Character.RecipeBook();
        Evening evening = new Evening();
        Evening.BedtimeStory bedtimeEvent = evening.new BedtimeStory("Муми-троллю и Фрекен Снорк", "дереве");


        moomin.watch(tree);
        moomin.think(stairs);
        moomin.setState(ObjectState.GOOD);

        moomin.interact();
        emma.runIn();
        emma.mumble();
        emma.knock(broom);
        emma.wander(darkness);
        moomin.look();
        smurfik.look();
        moomin.setState(ObjectState.BAD);
        moomin.interact();
        moomin.setState(ObjectState.FORGOTTEN);
        moomin.interact();
        emma.visit(darkness);

        bedtimeEvent.displayEvent();
        mom.prepareBreakfast(recipeBook);


    }
}