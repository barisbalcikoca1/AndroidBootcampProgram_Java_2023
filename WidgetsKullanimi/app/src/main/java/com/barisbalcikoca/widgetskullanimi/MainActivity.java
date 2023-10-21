package com.barisbalcikoca.widgetskullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import com.barisbalcikoca.widgetskullanimi.databinding.ActivityMainBinding;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private boolean toggleKontrol = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnOku.setOnClickListener(view -> {
            String alinanVeri = binding.editTextGirdi.getText().toString();
            binding.tvSonuc.setText(alinanVeri);
        });

        //2 Türlü kullanımı var allta kullanılan Res klasörü altından drawble a ulaşıp resme ulaşmak.
        binding.btnMutlu.setOnClickListener(view -> {
            binding.imageView.setImageResource(R.drawable.icon_mutlu);
        });

        //2.Kullanım ise resmin ismi ile ulaşmak. --> Veri tabanı ile bağlantılı bir projede bu işlemi yapmak daha güzel olur.
        //resmin string ismi ile ulaşabildik.
        binding.btnMutsuz.setOnClickListener(view -> {
            binding.imageView.setImageResource(getResources().getIdentifier("icon_mutsuz", "drawable", getPackageName()));
        });

        binding.switch1.setOnCheckedChangeListener(((compoundButton, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Switch Butonu ON", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Switch Butonu OFF", Toast.LENGTH_SHORT).show();
            }
        }));

        //group toggle butonu ifade eder
        //is cheked seçilip seçilmeme durumunu ifade eder.
        binding.toggleButton.addOnButtonCheckedListener(((group, checkedId, isChecked) -> {

            toggleKontrol = isChecked;
            if(toggleKontrol){
                Button secilenButton = findViewById(binding.toggleButton.getCheckedButtonId());
                String secilenButtonText = secilenButton.getText().toString();
                Toast.makeText(this, secilenButtonText, Toast.LENGTH_SHORT).show();
            }

        }));

        //Liste içerisinde ülkeleri tutabilmek için oluşturduğumuz yapı ve eklenen elemanlar.
        ArrayList<String> ulkeler = new ArrayList<>();
        ulkeler.add("Türkiye");
        ulkeler.add("Fransa");
        ulkeler.add("Almanya");

        //Bu elemanların nerede görüneceği için adapter oluşturulur. Hazır tasarım olan simplelistitem1 i ne ile erişeceğimizi seçiyoruz.
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,ulkeler);
        binding.autoCompleteTextView.setAdapter(arrayAdapter);


        //Visible --> Görünür demek
        //Invisible --> Görünmez demek fakat orada yer kaplar. örneğin bu örnekte progress bar invisible olursa orada yer kaplar fakat görünmez.
        //Gone --> Görünmez demek ve yer kaplamaz demek.

        binding.btnBasla.setOnClickListener(view -> {
            binding.progressBar.setVisibility(View.VISIBLE);

        });
        binding.btnDur.setOnClickListener(view -> {
            binding.progressBar.setVisibility(View.INVISIBLE);
        });


        //SLIDER İÇİN KODLAR
        binding.tvSlider.setText("Slider Değeri : "+binding.slider.getProgress());
        binding.slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //i değeri değişimi verir.
                binding.tvSlider.setText("Slider Değeri : "+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        //SAAT
        binding.btnSaat.setOnClickListener(view -> {
            MaterialTimePicker materialTimePicker = new MaterialTimePicker.Builder()
                    .setTitleText("Saat Seçiniz")
                    .setTimeFormat(TimeFormat.CLOCK_24H)
                    .build();
            materialTimePicker.show(getSupportFragmentManager(),"Saat");
            materialTimePicker.addOnPositiveButtonClickListener(view1 -> {
                binding.editTextSaat.setText(materialTimePicker.getHour()+" : "+materialTimePicker.getMinute());
            });
        });

        //TARİH
        binding.btnTarih.setOnClickListener(view -> {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.Builder.datePicker()
                    .setTitleText("Tarih Seçiniz")
                    .build();
            materialDatePicker.show(getSupportFragmentManager(),"Tarih");
            materialDatePicker.addOnPositiveButtonClickListener(view1 ->{
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                String tarih = simpleDateFormat.format(view1);
                binding.editTextTarih.setText(tarih);
            });

        });


        binding.btnGoster.setOnClickListener(view -> {
            String ulke = binding.autoCompleteTextView.getText().toString();
            Toast.makeText(this, ulke, Toast.LENGTH_SHORT).show();

        });



    }
}