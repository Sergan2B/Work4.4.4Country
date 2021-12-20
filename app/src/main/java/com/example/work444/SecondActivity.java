package com.example.work444;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private int position;
    private ArrayList<Country> dataCountry;
    private RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        position = getIntent().getIntExtra("Africa14", 100);
        String.valueOf(position);
        load();
        initRecycleView();
    }

    private void initRecycleView() {
        recyclerView2 = findViewById(R.id.recycleViewSecond);
        AdapterCountry adapter2 = new AdapterCountry(dataCountry, this);
        recyclerView2.setAdapter(adapter2);
    }

    private void load() {
        dataCountry = new ArrayList<>();
        switch (position) {
            case 0:
                dataCountry.add(new Country("https://cdn.pixabay.com/photo/2013/07/13/14/01/algeria-161961_1280.png", "Алжир", "Алжир"));
                dataCountry.add(new Country("https://1.bp.blogspot.com/-0lvBOnj65n4/WyeP4lnEiSI/AAAAAAAAhzQ/2p27xAHr-kEwvHU5XRZ1HYo_AuJOeNuoACLcBGAs/s1600/ma.png", "Рабат", "Марокко"));
                dataCountry.add(new Country("https://www.flagpictures.org/downloads/print/tunisia1.jpg", "Тунис", "Тунис"));
                dataCountry.add(new Country("https://i.pinimg.com/originals/42/a6/dc/42a6dc56083b3c79b09a22ef7375a335.jpg", "Каир", "Египет"));
                dataCountry.add(new Country("https://shop.vistamarltd.com/files/148543486566636.jpg", "Кейптаун", "ЮАР"));
                break;
            case 1:
                dataCountry.add(new Country("https://ggym.ru/wp-content/uploads/2021/10/flag-russia-XL.jpg", "Москва", "Россия"));
                dataCountry.add(new Country("https://flagof.ru/wp-content/uploads/2018/10/Germany-flag.jpg", "Берлин", "Германия"));
                dataCountry.add(new Country("https://media.baamboozle.com/uploads/images/9452/1632295169_8209.png", "Рим", "Италия"));
                dataCountry.add(new Country("https://avatars.mds.yandex.net/get-zen_doc/1821029/pub_5ebfcfe3ed526f6abcb9770a_5ebfd05664a20d0122a59ee2/scale_1200", "Лондон", "Великобритания"));
                dataCountry.add(new Country("https://flagof.ru/wp-content/uploads/2018/10/Spain-Flag.png", "Мадрид", "Испания"));
                break;
            case 2:
                dataCountry.add(new Country("https://www.digiseller.ru/preview/147467/p1_2213209_cd8256a7.jpg", "Вашингтон", "США"));
                dataCountry.add(new Country("https://www.a1flagsnpoles.com/wp-content/uploads/2017/11/A1-Flags-and-Poles-Flags-International-Canada-Flag-1A.jpg", "Оттава", "Канада"));
                dataCountry.add(new Country("https://posolstva-russia.gorpnz.ru/images/mexican.png", "Мехико", "Мексика"));
                dataCountry.add(new Country("https://burogt.ru/images/43/cuba_1580116935754_[2200x3024].png", "Гавана", "Куба"));
                dataCountry.add(new Country("https://avatars.mds.yandex.net/i?id=cdc23717cebb145288d23cff0a96433a-5171322-images-thumbs&n=13", "Сан-Хосе", "Коста-Рика"));
                break;
            case 3:
                dataCountry.add(new Country("https://oir.mobi/uploads/posts/2019-12/1575949564_25-43.png", "Бразилиа", "Бразилия"));
                dataCountry.add(new Country("https://cdn.pixabay.com/photo/2013/07/12/14/14/venezuela-148036_1280.png", "Каракас", "Венесуэла"));
                dataCountry.add(new Country("https://i.ytimg.com/vi/7D1vZAXk1xI/maxresdefault.jpg", "Сантьяго", "Чили"));
                dataCountry.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1599px-Flag_of_Peru_%28state%29.svg.png", "Лима", "Перу"));
                dataCountry.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_Bolivia_%28state%29.svg/1599px-Flag_of_Bolivia_%28state%29.svg.png", "Сукре", "Боливия"));
                break;
            case 4:
                dataCountry.add(new Country("https://www.digiseller.ru/preview/734851/p1_2431626_e17a3460.jpg", "Канберра", "Австралия"));
                dataCountry.add(new Country("https://www.smallpatches.com/assets/Image/Product/thumb/Flags/World/FIJ.jpg", "Веллингтон", "Новая Зеландия"));
                dataCountry.add(new Country("https://militaryarms.ru/wp-content/uploads/2021/09/28a5245d1b6eb980ed404edd2cd260eb.jpg", "Сува", "Фиджи"));
                dataCountry.add(new Country("https://cdn.pixabay.com/photo/2012/04/11/15/46/vanuatu-28604_1280.png", "Порт-Вила", "Вануату"));
                dataCountry.add(new Country("https://cdn.nexternal.com/boyles/images/TONGA1.jpg", "Нукуалофа", "Тонга"));
                break;
            default:
                break;
        }
    }
}