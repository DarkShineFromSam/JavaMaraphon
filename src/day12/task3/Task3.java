package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb = new MusicBand("Time impala",2007);
        MusicBand mb1 = new MusicBand("The Cure", 1976);
        MusicBand mb2 = new MusicBand("The Beatles",1960);
        MusicBand mb3 = new MusicBand("Skryptonite",2018);
        MusicBand mb4 = new MusicBand("Pompeya",2006);
        MusicBand mb5 = new MusicBand("Пасош",2014);
        MusicBand mb6 = new MusicBand("Jeferson Airplane",1965);
        MusicBand mb7 = new MusicBand("Jimi Hendrix Experience",1966);
        MusicBand mb8 = new MusicBand("Kedr Livanskiy",2008);
        MusicBand mb9 = new MusicBand("Кровосток",2003);

        List<MusicBand>bands = new ArrayList<>();
        bands.add(mb);
        bands.add(mb1);
        bands.add(mb2);
        bands.add(mb3);
        bands.add(mb4);
        bands.add(mb5);
        bands.add(mb6);
        bands.add(mb7);
        bands.add(mb8);
        bands.add(mb9);

        System.out.println(bands);

        Collections.shuffle(bands);

        System.out.println(bands);

        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for(MusicBand band: bands){
            if (band.getYear() > 2000){
                bandsAfter2000.add(band);
            }
        }
        System.out.println(bandsAfter2000);
    }
}
