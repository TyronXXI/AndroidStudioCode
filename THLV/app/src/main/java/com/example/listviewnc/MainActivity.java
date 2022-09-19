package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList<BaiHat> arrayBaiHat;
    BaiHatAdapter adapter;

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

    }
    private void AnhXa(){
        lvBaiHat = (ListView) findViewById(R.id.listviewBaiHat);
        arrayBaiHat = new ArrayList<>();
        arrayBaiHat.add(new BaiHat("Vì Anh Đâu Có Biết", "Madihu ft. Vũ.",R.drawable.vianhdaucobiet));
        arrayBaiHat.add(new BaiHat("Waiting For You", "MONO,Onionn",R.drawable.watingforyou));
        arrayBaiHat.add(new BaiHat("Bên Trên Tầng Lầu", "Tăng Duy Tân",R.drawable.bentrentanglau));
        arrayBaiHat.add(new BaiHat("ThichThich", "Phương Ly",R.drawable.thichthich));
        arrayBaiHat.add(new BaiHat("Chậm Lại", "Vũ.",R.drawable.chamlai));
        arrayBaiHat.add(new BaiHat("đứa nào làm em buồn?", "Phúc Du ft. Hoàng Dũng",R.drawable.duanaolamembuon));
        arrayBaiHat.add(new BaiHat("Ngã Tư Không Đèn", "TRANG, Khoa Vũ",R.drawable.ngatukhongden));
        arrayBaiHat.add(new BaiHat("Một Ngàn Nổi Đau", "Văn Mai Hương, Hứa Kim Tuyền",R.drawable.motngannoidau));
        arrayBaiHat.add(new BaiHat("Chìm Sâu", "RPT MCK ft. Trung Trần",R.drawable.chimsau));
        arrayBaiHat.add(new BaiHat("vaicaunoicokhiennguoithaydoi", "GREY D x tlinh",R.drawable.vaicaunoi));
    }

}