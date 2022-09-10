package com.example.cuocduakithu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtDiem;
    CheckBox cbOne, cbTwo, cbThree;
    SeekBar skOne, skTwo, skThree;
    ImageButton ibtnPlay;
    int soDiem = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        skOne.setEnabled(false);
        skTwo.setEnabled(false);
        skThree.setEnabled(false);
        txtDiem.setText(soDiem + "");
        CountDownTimer countDownTimer = new CountDownTimer(20000,150) {
            @Override
            public void onTick(long l) {
                int number = 3;
                Random random = new Random();
                int one = random.nextInt(number);
                int two = random.nextInt(number);
                int three = random.nextInt(number);

                if(skOne.getProgress()>=skOne.getMax()){
                    this.cancel();
                    ibtnPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "ONE WIN", Toast.LENGTH_SHORT).show();
                    if(cbOne.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "Bạn đoán chính xác!", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn đoán sai rồi!", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem + "");
                    EnableChecBox();
                }
                if(skTwo.getProgress()>=skTwo.getMax()){
                    this.cancel();
                    ibtnPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "TWO WIN", Toast.LENGTH_SHORT).show();
                    if(cbTwo.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "Bạn đoán chính xác!", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn đoán sai rồi!", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem + "");
                    EnableChecBox();
                }
                if(skThree.getProgress()>=skThree.getMax()){
                    this.cancel();
                    ibtnPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "THREE WIN", Toast.LENGTH_SHORT).show();
                    if(cbThree.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this, "Bạn đoán chính xác!", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn đoán sai rồi!", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem + "");
                    EnableChecBox();
                }

                skOne.setProgress(skOne.getProgress()+one);
                skTwo.setProgress(skTwo.getProgress()+two);
                skThree.setProgress(skThree.getProgress()+three);


            }

            @Override
            public void onFinish() {

            }
        };
        ibtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbOne.isChecked()||cbTwo.isChecked()||cbThree.isChecked()){
                    skOne.setProgress(0);
                    skTwo.setProgress(0);
                    skThree.setProgress(0);
                    ibtnPlay.setVisibility(View.INVISIBLE);
                    countDownTimer.start();
                    DisableCheckBox();
                }else {
                    Toast.makeText(MainActivity.this, "Vui lòng đặt cược trước khi chơi!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        cbOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(isChecked){
                      cbTwo.setChecked(false);
                      cbThree.setChecked(false);
                  }
            }
        });
        cbTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbOne.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });
        cbThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbTwo.setChecked(false);
                    cbOne.setChecked(false);
                }
            }
        });
    }
    private void Anhxa (){
        txtDiem     = (TextView) findViewById(R.id.testviewDiemSo);
        cbOne       = (CheckBox) findViewById(R.id.checkboxOne);
        cbTwo       = (CheckBox) findViewById(R.id.checkboxTwo);
        cbThree     = (CheckBox) findViewById(R.id.checkboxThree);
        skOne       = (SeekBar) findViewById(R.id.seekbarOne);
        skTwo       = (SeekBar) findViewById(R.id.seekbarTwo);
        skThree     = (SeekBar) findViewById(R.id.seekbarThree);
        ibtnPlay    =(ImageButton) findViewById(R.id.buttonPlay);
    }
    private void EnableChecBox(){
        cbOne.setEnabled(true);
        cbTwo.setEnabled(true);
        cbThree.setEnabled(true);
    }
    private void DisableCheckBox(){
        cbOne.setEnabled(false);
        cbTwo.setEnabled(false);
        cbThree.setEnabled(false);
    }
}