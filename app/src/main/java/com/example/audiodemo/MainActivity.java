package com.example.audiodemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private MusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Freedom Road", "Len Magee", R.raw.freedom_road));
        arrayList.add(new Music("I Found God", "Len Magee", R.raw.i_found_god));
        arrayList.add(new Music("Mary Mary", "Len Magee", R.raw.mary_mary));
        arrayList.add(new Music("The Morning Comes", "Len Magee", R.raw.the_morning_comes));
        arrayList.add(new Music("Which Station", "Len Magee", R.raw.which_station));
        arrayList.add(new Music("As I Was Walking", "Len Magee", R.raw.as_i_was_walking));
        arrayList.add(new Music("For Me", "Len Magee", R.raw.for_me));
        arrayList.add(new Music("Nativity", "Len Magee", R.raw.nativity));
        arrayList.add(new Music("Cast Your Burden", "Len Magee", R.raw.cast_your_burden));
        arrayList.add(new Music("Is It Nothing To You", "Len Magee", R.raw.is_it_nothing_to_you));

        adapter = new MusicAdapter(this, R.layout.music_item, arrayList);
        songList.setAdapter(adapter);


    }
}
