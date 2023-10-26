package com.example.animalvoice;
public interface Chorus {
    public static void main (String [] args) {
        MakeVoice [] mv = new MakeVoice[4];
        mv[0] = new Cat();
        mv[1] = new Hyena();
        mv[2] = new Seagull();
        mv[3] = new Solovey();


        for (MakeVoice m : mv) m.voice();
    }
}