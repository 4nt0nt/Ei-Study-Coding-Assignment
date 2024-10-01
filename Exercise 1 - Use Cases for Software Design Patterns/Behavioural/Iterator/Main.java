package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}

class Playlist implements Iterable<Song> {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public Iterator<Song> iterator() {
        return new SongIterator();
    }

    private class SongIterator implements Iterator<Song> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < songs.size();
        }

        @Override
        public Song next() {
            return songs.get(index++);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Kun Faya Kun", "A.R. Rahman, Javed Ali, Mohit Chauhan"));
        playlist.addSong(new Song("Munbe Vaa", "Naresh Iyer, Shreya Ghoshal"));
        playlist.addSong(new Song("The Beloved", "A.R. Rahman"));

        for (Song song : playlist) {
            System.out.println(song);
        }
    }
}

