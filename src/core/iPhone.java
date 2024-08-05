package core;

import contracts.Browser;
import contracts.MediaPlayer;
import contracts.Phone;

public class iPhone implements Browser, Phone, MediaPlayer {

    @Override
    public void play() {
        System.out.println("Tocando música via iPhone");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música via iPhone");
    }

    @Override
    public void selectSong(String songName) {
        System.out.println("Selecionando canção " + songName + " via iPhone");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Ligando para " + phoneNumber + " via iPhone");
    }

    @Override
    public void answer() {        
        System.out.println("Atendendo via iPhone");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando o correio de voz via iPhone");
    }

    @Override
    public void openPage(String url) {
        System.out.println("Abrindo página " + url + " via iPhone");
    }

    @Override
    public void openNewTab() {
        System.out.println("Abrindo nova aba via iPhone");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página via iPhone");
    }

}
