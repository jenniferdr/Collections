package cl.jenni.collections;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.orm.SugarRecord;

import java.util.List;

import cl.jenni.collections.models.Favorite;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String act = intent.getAction();

        if(act != null){
                if(Intent.ACTION_SEND.equals(act)){
                    String url = intent.getStringExtra(Intent.EXTRA_TEXT);
                    Log.d("La super url: ", url);
                }
        }

        /*Favorite fav = new Favorite("www.hola.com",true);
        //fav.save();

        Favorite fav2 = SugarRecord.findById(Favorite.class,1);
        Log.d("fav",fav2.getUrl());

        List<Favorite> favs = Favorite.listAll(Favorite.class);
        Log.d("FavoriteSize: ", String.valueOf(favs.size()));

        Favorite favenc = Favorite.findById(Favorite.class,1);
        Log.d("El uno", favenc.getUrl());*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toastItem:
                Toast.makeText(this,"menu selected",2).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
