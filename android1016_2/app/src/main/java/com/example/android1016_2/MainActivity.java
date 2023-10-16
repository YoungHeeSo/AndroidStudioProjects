package com.example.android1016_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] titles={
            "the wizard of Oz(1938)",
            "citizen kane(1941)",
            "all about Eve(1950)",
            "the third Man(1949)",
            "A hard Day's Night(1964)",
            "Modern times(1936)",
            "Metropolis(1927)",
            /*"the wizard of Oz(1938)",
            "the wizard of Oz(1938)",
            "the wizard of Oz(1938)",*/
    };

    Integer[] images={
            R.drawable.movie1,
            R.drawable.movie2,
            R.drawable.movie3,
            R.drawable.movie4,
            R.drawable.movie5,
            R.drawable.movie6,
            R.drawable.movie7,
            /*R.drawable.movie7,
            R.drawable.movie7,
            R.drawable.movie7,*/
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList adapter = new CustomList(MainActivity.this);
        list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getBaseContext(), titles[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    private class CustomList extends ArrayAdapter<String> {
        private final Activity context;
        public CustomList(Activity context){
            super(context, R.layout.listitem, titles);
            this.context = context;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.listitem, null, true);

            ImageView imageView = (ImageView) rowView.findViewById(R.id.image);

            TextView title = (TextView) rowView.findViewById(R.id.title);
            TextView rating = (TextView) rowView.findViewById(R.id.rating);
            TextView genre = (TextView) rowView.findViewById(R.id.genre);
            TextView year = (TextView) rowView.findViewById(R.id.releaseYear);

            title.setText(titles[position]);
            imageView.setImageResource(images[position]);
            rating.setText("9.0"+position);
            genre.setText("DRAMA");
            year.setText(1930+position+"");
            return rowView;
        }
    }
}