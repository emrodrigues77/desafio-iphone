import core.iPhone;

public class App {
    public static void main(String[] args) throws Exception {
        iPhone iPhone = new iPhone();

        iPhone.play();
        iPhone.pause();
        iPhone.selectSong("Rock and Roll");
        iPhone.call("123456789");
        iPhone.answer();
        iPhone.startVoiceMail();
        iPhone.openPage("www.google.com");
        iPhone.openNewTab();
        iPhone.refreshPage();
    }
}
