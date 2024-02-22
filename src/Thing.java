class Thing {
    private String name;

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void use() {
        System.out.println(name + " используется.");
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                '}';
    }
}