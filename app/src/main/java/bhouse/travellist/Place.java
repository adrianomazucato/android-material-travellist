package bhouse.travellist;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by megha on 15-03-06.
 */
public class Place {

    public String id;
    public String name;
    public String imageName;
    public boolean isFav;
    public int type;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}
