package org.gabriel.phone.phone;

public class CellPhone implements Phone {

    @Override
    public void call(String number) {
        System.out.println("Call " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Answer Call");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Start Voicemail");
    }
}
