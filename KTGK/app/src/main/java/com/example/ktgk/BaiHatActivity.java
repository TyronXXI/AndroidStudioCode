package com.example.ktgk;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class BaiHatActivity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList<BaiHat> arrayBaiHat;
    BaiHatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baihat);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AnhXa();
        adapter = new BaiHatAdapter(this, R.layout.layoutbaihat, arrayBaiHat);
        lvBaiHat.setAdapter(adapter);
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai11.class);
                    startActivity(myIntent);
                }
                if(position==1){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai12.class);
                    startActivity(myIntent);
                }
                if(position==2){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai3.class);
                    startActivity(myIntent);
                }
                if(position==3){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai4.class);
                    startActivity(myIntent);
                }
                if(position==4){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai5.class);
                    startActivity(myIntent);
                }
                if(position==5){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai6.class);
                    startActivity(myIntent);
                }
                if(position==6){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai7.class);
                    startActivity(myIntent);
                }
                if(position==7){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai8.class);
                    startActivity(myIntent);
                }
                if(position==8){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai9.class);
                    startActivity(myIntent);
                }
                if(position==9){
                    Intent myIntent = new Intent(BaiHatActivity.this, Bai10.class);
                    startActivity(myIntent);
                }

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
