package com.example.listviewnc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList<BaiHat> arrayBaiHat;
    BaiHatAdapter adapter;



    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int index = info.position;
        switch (item.getItemId()){
            case R.id.xoa:
               arrayBaiHat.remove(index);
               adapter.notifyDataSetChanged();
                return true;
            case R.id.khong:
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        adapter = new BaiHatAdapter(this, R.layout.dong_bai_hat, arrayBaiHat);
        lvBaiHat.setAdapter(adapter);
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long l) {
//                Intent myIntent=new Intent(MainActivity.this, ChildActivity.class);
//                startActivity(myIntent);
//                return false;
//            }
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent myIntent=new Intent(MainActivity.this, ChildActivity.class);
                startActivity(myIntent);
            }
        });

        registerForContextMenu(lvBaiHat);

    }
    private void AnhXa(){
        lvBaiHat = (ListView) findViewById(R.id.listviewBaiHat);
        arrayBaiHat = new ArrayList<>();
        arrayBaiHat.add(new BaiHat("Kimpap", "* 4.2 | 1.5km", R.drawable.kimpad," 53.100VNĐ"));
        arrayBaiHat.add(new BaiHat("Sushi Thập Cẩm", "* 4.7 | 0.9km", R.drawable.susi,"125.400VNĐ"));
        arrayBaiHat.add(new BaiHat("Cá Diêu Hồng Chiên Mắm", "* 4.5 | 1.7km", R.drawable.ca," 79.000VNĐ"));
        arrayBaiHat.add(new BaiHat("Tôm Hùm Nguyên Con", "* 4.9 | 2.3km", R.drawable.tomhum,"139.000VNĐ"));
        arrayBaiHat.add(new BaiHat("Hamburger Gà", "* 4.3 | 1.8km", R.drawable.hamberger," 35.500VNĐ"));
        arrayBaiHat.add(new BaiHat("Thịt Xiên Que Nướng", "* 4.8 | 1.2km", R.drawable.xinque11," 62.000VNĐ"));
        arrayBaiHat.add(new BaiHat("Sandwich Nâu", "* 4.2 | 1.0km", R.drawable.sanwick," 39.900VNĐ"));
        arrayBaiHat.add(new BaiHat("Sủi Cảo Hấp", "* 4.6 | 3.1km", R.drawable.suicao," 99.000VNĐ"));
        arrayBaiHat.add(new BaiHat("Bánh Chocolate Đậu Phộng", "* 5.0 | 2.9km", R.drawable.banh," 42.000VNĐ"));
        arrayBaiHat.add(new BaiHat("Chocolate Miếng", "* 4.1 | 3.5km", R.drawable.socola," 35.000VNĐ"));

    }

}