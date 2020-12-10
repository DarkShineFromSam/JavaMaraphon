package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Slick",50));
        members1.add(new MusicArtist("Marty Balin",35));
        members1.add(new MusicArtist("Paul Kantner",24));
        members1.add(new MusicArtist("Jorma Kaukonen",40));
        members1.add(new MusicArtist("Jack Casady",45));
        members1.add(new MusicArtist("Spencer Dryden",42));

        MusicBand band = new MusicBand("Jeferson Airplane",1965,members1);

        List<MusicArtist>members2 = new ArrayList<>();
        members2.add(new MusicArtist("John Lennon",32));
        members2.add(new MusicArtist("Paul McCartney",54));
        members2.add(new MusicArtist("Ringo Starr",61));
        members2.add(new MusicArtist("George Harrison",45));

        MusicBand band1 = new MusicBand("The Beatles",1960,members2);

        band.printMembers();
        band1.printMembers();

        MusicBand.transferMembers(band, band1);

        band.printMembers();
        band1.printMembers();
    }
}
