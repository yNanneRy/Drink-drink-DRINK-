import java.io.File;
import javax.sound.sampled.*;

public class Sons {

    Clip efeito2;
    Clip efeito3;
    Clip tema;
    Clip jogoFinalizado;

    public void Efeito2() {
        String dir = System.getProperty("user.dir");
        File lol = new File(dir + "/Sons/Efeito2.wav");
        try {
            efeito2 = AudioSystem.getClip();
            efeito2.open(AudioSystem.getAudioInputStream(lol));
            efeito2.start();
        } catch (Exception e) {
            System.out.print(System.getProperty("user.dir"));
            e.printStackTrace();
        }
    }

    public void Efeito3() {
        String dir = System.getProperty("user.dir");
        File lol = new File(dir + "/Sons/Efeito3.wav");
        try {
            efeito3 = AudioSystem.getClip();
            efeito3.open(AudioSystem.getAudioInputStream(lol));
            efeito3.start();
        } catch (Exception e) {
            System.out.print(System.getProperty("user.dir"));
            e.printStackTrace();
        }
    }
    
    public void EfeitoSuspense() {
        String dir = System.getProperty("user.dir");
        File lol = new File(dir + "/Sons/EfeitoSuspense.wav");
        try {
            efeito3 = AudioSystem.getClip();
            efeito3.open(AudioSystem.getAudioInputStream(lol));
            efeito3.start();
        } catch (Exception e) {
            System.out.print(System.getProperty("user.dir"));
            e.printStackTrace();
        }
    }

    public void Tema() {
        String dir = System.getProperty("user.dir");
        File lol = new File(dir + "/Sons/falha.wav");
        try {
            tema = AudioSystem.getClip();
            tema.open(AudioSystem.getAudioInputStream(lol));
            tema.start();
            tema.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.out.print(System.getProperty("user.dir"));
            e.printStackTrace();
        }
    }

    public void pararEfeito2() {
        try {
            efeito2.stop();
        } catch (Exception e) {
            System.out.print(System.getProperty("user.dir"));
            e.printStackTrace();
        }
    }
    
    public void pararEfeito3() {
        try {
            efeito3.stop();
        } catch (Exception e) {
            System.out.print(System.getProperty("user.dir"));
            e.printStackTrace();
        }
    }

    public void pausarTema() {
        try {
            tema.wait();
        } catch (Exception e) {
            System.out.print(System.getProperty("user.dir"));
            e.printStackTrace();
        }
    }
    
    public void jogoFinalizado() {
        String dir = System.getProperty("user.dir");
        File lol = new File(dir + "/Sons/JogoFinalizado.wav");
        try {
            jogoFinalizado = AudioSystem.getClip();
            jogoFinalizado.open(AudioSystem.getAudioInputStream(lol));
            jogoFinalizado.start();
        } catch (Exception e) {
            System.out.print(System.getProperty("user.dir"));
            e.printStackTrace();
        }
    }
}