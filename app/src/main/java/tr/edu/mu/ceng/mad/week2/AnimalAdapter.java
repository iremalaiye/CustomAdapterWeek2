package tr.edu.mu.ceng.mad.week2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Animal> animals;

    public AnimalAdapter(Activity activity, List<Animal> animals) {
        this.mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        this.animals = animals;
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView;
        rowView=mInflater.inflate(R.layout.listview_row,null);
        TextView textView= (TextView) rowView.findViewById(R.id.label);
        ImageView imageView=(ImageView)  rowView.findViewById(R.id.pic);
        Animal animal= animals.get(position);
        textView.setText(animal.getType());
        imageView.setImageResource(animal.getPicId());
        return rowView;
    }
}
