package wit.edu.moblieapp.listview_customized_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap defaultImage;
        defaultImage =
                BitmapFactory.decodeResource(getResources(), R.drawable.default_image);

        // Create testing data
        List<ListItem> list = new ArrayList<ListItem>();

        ListItem item1 = new ListItem();
        item1.image = defaultImage;
        item1.name = "David";
        item1.comment = "Boston is not snowing now.";
        list.add(item1);

        ListItem item2 = new ListItem();
        item2.image = defaultImage;
        item2.name = "Cooper";
        item2.comment = "The design is so cool";
        list.add(item2);

        ListItem item3 = new ListItem();
        item3.image = defaultImage;
        item3.name = "Jones";
        item3.comment = "I like hacking. Do you like it?";
        list.add(item3);

        // Create ListItemAdapter
        ListItemAdapter adapter;
        adapter = new ListItemAdapter(this, 0, list);

        // Assign ListItemAdapter to ListView
        ListView listView = (ListView)findViewById(R.id.ListView01);
        listView.setAdapter(adapter);
    }
}
