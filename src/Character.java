abstract class Character implements Interactable, Speakable {

    public static Character.RecipeBook RecipeBook;
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new InvalidNameException("Нельзя изменить имя персонажу на null");
        }
        this.name = name;
    }

    public void mumble() {
        System.out.println(name + " бормочет что-то.");
    }

    public void look() {
        System.out.println(name + " смотрит вслед.");
    }

    public void runIn() {
        System.out.println(name + " прибежала.");
    }

    public void knock(Thing item) {
        System.out.println(name + " постучала обьектом : " + item.getName() + ".");
    }

    public void wander(Place place) {
        System.out.println(name + " заковыляла в : " + place.getName() + ".");
    }

    public void interact() {
        System.out.println(name + " взаимодействует с другим объектом.");
    }

    public void visit(Place place) {
        System.out.println(name + " посетил(а) место: " + place.getName());
    }

    public void watch(Thing thing) {
        System.out.println(name + " разглядывает обьект : " + thing.getName());
    }

    public void think(Thing mind) {
        System.out.println(name + " подумал об : " + mind.getName());
    }

    public void prepareBreakfast(RecipeBook recipeBook) {
        // Локальный класс для приготовления завтрака
        class BreakfastCook {
            public void makeToast() {
                System.out.println(name + " готовит тосты.");
            }

            public void fryEggs() {
                System.out.println(name + " жарит яйца.");
            }

            public void brewCoffee() {
                System.out.println(name + " варит кофе.");
            }

            public void serveBreakfast() {
                System.out.println(name + " дает корзинку с завтраком детям.");
            }
        }

        // Получение случайного рецепта из RecipeBook
        int recipeIndex = (int) (Math.random() * RecipeBook.recipes.length);
        String recipe = RecipeBook.recipes[recipeIndex];

        // Создание объекта локального класса и вызов методов для приготовления завтрака
        BreakfastCook breakfastCook = new BreakfastCook();
        System.out.println(name + " готовит завтрак: " + recipe);
        switch (recipe) {
            case "Тосты":
                breakfastCook.makeToast();
                break;
            case "Яйца-бенедикт":
                breakfastCook.fryEggs();
                break;
            case "Фреш из апельсинов":
                System.out.println(name + " делает свежевыжатый фруктовый сок.");
                break;
            case "Омлет":
                System.out.println(name + " готовит омлет.");
                break;
            default:
                System.out.println("Неизвестный рецепт: " + recipe);
        }
        breakfastCook.serveBreakfast();

        // Использование анонимного класса для приготовления сока
        FruitJuicer fruitJuicer = new FruitJuicer() {
            @Override
            public void prepareJuice() {
                System.out.println(name + " хочет порадовать муми-торллей и делает им пирожные.");
            }
        };
        fruitJuicer.prepareJuice();
    }

    static class RecipeBook {
        static String[] recipes = {"Тосты", "Яйца-бенедикт", "Фреш из апельсинов", "Омлет"};

        public static void main(String[] args) {
            MoominTroll mom = new MoominTroll("Мама", ObjectState.GOOD);
            RecipeBook recipeBook = new RecipeBook();
            mom.prepareBreakfast(recipeBook);
        }

    }
}
