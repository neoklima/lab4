public class Evening {
    // Non-static вложенный класс для представления события "Вечером мама постелила Муми-троллю и Фрекен Снорк на дереве"
    class BedtimeStory {
        private String characters;
        private String location;

        public BedtimeStory(String characters, String location) {
            this.characters = characters;
            this.location = location;
        }

        public void displayEvent() {
            System.out.println("Вечером мама постелила " + characters + " на " + location);
        }
    }

}
