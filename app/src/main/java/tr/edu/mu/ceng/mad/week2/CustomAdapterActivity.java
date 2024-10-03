package tr.edu.mu.ceng.mad.week2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal> animals=new ArrayList<Animal>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("kuzu",R.mipmap.kuzu));
        animals.add(new Animal("papagan",R.mipmap.papagan));
        animals.add(new Animal("kuzu",R.mipmap.kuzu));
        animals.add(new Animal("kuzu",R.mipmap.kuzu));
        animals.add(new Animal("kuzu",R.mipmap.kuzu));
    final ListView listView= (ListView) findViewById(R.id.listview);
    AnimalAdapter adapter=new AnimalAdapter(this,animals);
    listView.setAdapter(adapter);

    }
}