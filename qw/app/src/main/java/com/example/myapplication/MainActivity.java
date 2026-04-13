package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] valu = {2, 3, 4, 5, 6, 7, 8, 9};
    int round_count = 0;
    int round_in_total = 0;
    boolean test1_now = false;
    int index1 = 0;
    int index2 = 0;
    int correct = 0;
    int mul_res = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void test1_round(View view){
        round_count++;
        if(test1_now == false){
            test1_now = true;
            round_in_total = 20;
        }
        setContentView(R.layout.testwind);

        String val = String.valueOf(round_count);
        TextView q_Now = findViewById(R.id.qNow);
        q_Now.setText(val);
        TextView q_Tot = findViewById(R.id.qTot);
        val = String.valueOf(round_in_total);
        q_Tot.setText(val);
        TextView c_1 = findViewById(R.id.c1);
        TextView c_2 = findViewById(R.id.c2);

        Random random = new Random();

        index1 = random.nextInt(3);
        index2 = random.nextInt(8);


        mul_res = valu[index1] * valu[index2];
        val = String.valueOf(valu[index1]);
        c_1.setText(val);
        val = String.valueOf(valu[index2]);
        c_2.setText(val);


    }
    public void answer(View view){
        EditText inp = findViewById(R.id.inputer);
        String answ = inp.getText().toString();
        int answInt = Integer.parseInt(answ);

        if(answInt == mul_res){
            correct++;
        }
        if(round_count >= round_in_total){
            res1(view);
        }
        else{
            test1_round(view);
        }
    }
    public void res1(View view){
        setContentView(R.layout.result1);
        TextView corr = (TextView) findViewById(R.id.corr);
        String val = String.valueOf(correct);
        corr.setText(val);
        TextView vse = (TextView) findViewById(R.id.vsego);
        val = String.valueOf(round_in_total);
        vse.setText(val);
        TextView phra = (TextView) findViewById(R.id.phrase);
        if(correct == round_in_total){
            phra.setText("ХАРОООООШ!!!");
        }
        ImageView sensen = (ImageView) findViewById(R.id.imageView3);
        if(correct == round_in_total){
            sensen.setImageResource(R.drawable.happii);
        }

        TextView text = findViewById(R.id.memeword);
        TextView name = findViewById(R.id.memename);
        ImageView memphot = findViewById(R.id.memephot);

        switch (correct){
            case 0:
                memphot.setImageResource(R.drawable.shikanoko);
                name.setText("Шиканоко");
                text.setText("Только и умеет, что сбрасывать " +
                        "рога и есть оленьи крекеры. " +
                        "Зачем ей умножение?");
                break;
            case 1:
                memphot.setImageResource(R.drawable.nubik);
                name.setText("Роблокс нубик");
                text.setText("Только зашёл в роблокс. " +
                        "Не особо умный, но новичкам ведь везёт?");
                break;
            case 2:
                memphot.setImageResource(R.drawable.skibidi);
                name.setText("Скибиди туалет");
                text.setText("Гррр... Скибиди доп доп доп ес ес!!!" +
                        "Скибиди доп доп доп диип дип!");
                break;
            case 3:
                memphot.setImageResource(R.drawable.kago);
                name.setText("Каго");
                text.setText("В отличие от Скибиди туалета, " +
                        "ты хотя бы не унитаз, а на унитазе...");
                break;
            case 4:
                memphot.setImageResource(R.drawable.estetic);
                name.setText("Эстетик гёрл");
                text.setText("Заюш, да зачем мне твоё умножение?" +
                        " Я подписчиков (вторые аккаунты) и без этого посчитаю!");
                break;
            case 5:
                memphot.setImageResource(R.drawable.amogus);
                name.setText("Амогус");
                text.setText("Ребят, а чё у меня ник красный? " +
                        "И как из люка вылезти скажите пж...");
                break;
            case 6:
                memphot.setImageResource(R.drawable.pon);
                name.setText("Акула пон");
                text.setText("Ну, пон так пон. Ясно понятно.");
                break;
            case 7:
                memphot.setImageResource(R.drawable.shiro);
                name.setText("Широ");
                text.setText("Только и делает, что 25/8 играет в игры" +
                        " и ест-ест-ест-ест!");
                break;
            case 8:
                memphot.setImageResource(R.drawable.skuf);
                name.setText("Скуф");
                text.setText("Немного умеет считать. Ведь надо же знать, сколько альтушек поместится в его прокаченном танке ИС-7.");
                break;
            case 9:
                memphot.setImageResource(R.drawable.gabriel);
                name.setText("Габриэль");
                text.setText("Даже лучший ангел академии разленился," +
                        " открыв для себя человеческий компуктер.");
                break;
            case 10:
                memphot.setImageResource(R.drawable.mshk_frede);
                name.setText("Мшк фрэд");
                text.setText("Нанюхался смачной бебры и пошёл умножать!");
                break;
            case 11:
                memphot.setImageResource(R.drawable.leon);
                name.setText("Леон");
                text.setText("Легендарная мечта Васи из 3-его Ы," +
                        "и многих других школьников до 5-го класса.");
                break;
            case 12:
                memphot.setImageResource(R.drawable.kobyakov);
                name.setText("Кобяков");
                text.setText("ТЫ ПРОСТО_ПРОСТО ПУШКА! Но не в умножении пока что...");
                break;
            case 13:
                memphot.setImageResource(R.drawable.miku);
                name.setText("Мику");
                text.setText("Умеет умножать только seven на eleven, " +
                        "но в ответе почему-то всегда *miku da yo!*");
                break;
            case 14:
                memphot.setImageResource(R.drawable.putin);
                name.setText("Широкий Путин");
                text.setText("Вот что бывает с людьми, " +
                        "когда их умножают на 2, 3, а то и на 4!");
                break;
            case 15:
                memphot.setImageResource(R.drawable.mils_kel);
                name.setText("Милс кел");
                text.setText("Играет в броблокс. " +
                        "Но в отличие от Эстетик гёрл " +
                        "подписчики настоящие (Не вторые аккаунты).");
                break;
            case 16:
                memphot.setImageResource(R.drawable.yoshi);
                name.setText("Йоши");
                text.setText("Очередной роблоксер. " +
                        "Ещё и анимешник походу... " +
                        "Адская смесь!");
                break;
            case 17:
                memphot.setImageResource(R.drawable.vlad);
                name.setText("Влад А4");
                text.setText("Жёстко считает свои " +
                        "ламбы умножением!");
                break;
            case 18:
                memphot.setImageResource(R.drawable.b);
                name.setText("BTS");
                text.setText("Вот они слева направо. " +
                        "Чигачкук, Ким Чен Ын, Носок, " +
                        "Песок и в поле Колосок.");
                break;
            case 19:
                memphot.setImageResource(R.drawable.mr_beast);
                name.setText("Мистер Бист");
                text.setText("Отлично знает таблицу умножения. " +
                        "Иначе как бы он строил мегаполис в центре Сахары" +
                        " для бедных местных за 10 минут?");
                break;
            case 20:
                memphot.setImageResource(R.drawable.sigma);
                name.setText("Сигма");
                text.setText("Он знает всё, тем более умножение! " +
                        "Сильный, принципиальный и лютый манипулятор.");
        }

    }
    public void returner(View view){
        round_count = 0;
        round_in_total = 0;
        test1_now = false;
        index1 = 0;
        index2 = 0;
        correct = 0;
        mul_res = 0;
        setContentView(R.layout.activity_main);
    }
}