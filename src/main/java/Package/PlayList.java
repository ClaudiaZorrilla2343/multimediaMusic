package Package;

import java.util.ArrayList;

public class PlayList {

    public void createPlayList() {

        Library library = new Library();
        //ArrayList<String> listString = new ArrayList<>();

        library.setListSong(new ArrayList<Song>());


        library.getListSong().add(new Song(Song.Genders.POP, "Rema", 12, 12,1.5, "cartón", "rap"));
    }


}
