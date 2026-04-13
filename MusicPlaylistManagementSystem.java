import java.util.Random;

// Song Class
class Song {
    private String title;
    private String artist;

    // Constructor
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Display method
    public void displaySong() {
        System.out.println("Title: " + title + ", Artist: " + artist);
    }
}

// Playlist Class
class Playlist {
    private Song[] songs;
    private int count;

    // Constructor
    public Playlist(int size) {
        songs = new Song[size];
        count = 0;
    }

    // Add Song Method
    public void addSong(Song song) {
        if (count < songs.length) {
            songs[count] = song;
            count++;
        } else {
            System.out.println("Playlist is full!");
        }
    }

    // Shuffle Playlist Method
    public void shufflePlaylist() {
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int j = rand.nextInt(count);

            // Swap songs
            Song temp = songs[i];
            songs[i] = songs[j];
            songs[j] = temp;
        }
    }

    // Display Playlist (Enhanced for-loop)
    public void displayPlaylist() {
        System.out.println("\nPlaylist Queue:");
        for (Song song : songs) {
            if (song != null) {
                song.displaySong();
            }
        }
    }
}

// Main Class
public class MusicPlaylistManagementSystem {
    public static void main(String[] args) {

        Playlist playlist = new Playlist(5);

        // Adding Songs
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));
        playlist.addSong(new Song("Kesariya", "Arijit Singh"));
        playlist.addSong(new Song("Believer", "Imagine Dragons"));

        // Display Original Playlist
        System.out.println("Original Playlist:");
        playlist.displayPlaylist();

        // Shuffle Playlist
        playlist.shufflePlaylist();

        // Display Shuffled Playlist
        System.out.println("\nShuffled Playlist:");
        playlist.displayPlaylist();
    }
}
