package Package;

import java.util.ArrayList;

public class Library {

    private ArrayList<Song> listSong;

    public ArrayList<Song> getListSong() {
        return listSong;
    }

    public Library setListSong(ArrayList<Song> listSong) {
        this.listSong = listSong;
        return this;
    }

    public void setListSong(Song song) {
        this.listSong.add(song);
    }


}
