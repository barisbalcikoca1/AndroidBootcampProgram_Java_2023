package com.barisbalcikoca.kullanicietkilesimi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.barisbalcikoca.kullanicietkilesimi.databinding.ActivityMainBinding;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        binding.btnToast.setOnClickListener(view -> {
            Toast.makeText(this, "Toast Butonu Tıklandı", Toast.LENGTH_SHORT).show();
        });
        binding.btnSnackbar.setOnClickListener(view -> {
            Snackbar.make(view,"Silinmesini istiyor musunuz?",Snackbar.LENGTH_SHORT)
                    //SET ACTION: Snackbarda en sağda bulunan buton ve bunun ismi verilir. Tıklanma olayı buraya yazılır.
                    .setAction("Evet",view1 -> {
                       Snackbar.make(view1,"Silindi",Snackbar.LENGTH_SHORT).show();
                    })
                    .setBackgroundTint(Color.WHITE) //Snackbarın direkt arka plan rengi
                    .setTextColor(Color.BLUE)   //Silinmesini istyior musunuz yazısının rengi
                    .setActionTextColor(Color.RED) // Evet yazısının rengi
                    .show();

        });
        binding.btnAlertDialog.setOnClickListener(view -> {
            new MaterialAlertDialogBuilder(this)
                    .setTitle("Başlık")
                    .setMessage("Mesaj Kısmı")
                    .setPositiveButton("Tamam",(d,i)->{
                        //Tamam butonuna tıklanınca olacak olaylar

                    })
                    .setNegativeButton("Hayır",(d,i)->{

                        //Hayır butonuna tıklanınca olacak olaylar
                    })
                    .setNeutralButton("İptal",(d,i)->{
                        //İptal butonuna tıklanınca olacak olaylar

                    })
                    .show();

        });

        //BAŞKA BİR ALERT DIALOG KULLANIMI
        binding.btnAlertDialog2.setOnClickListener(view -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Emin Misiniz?");
            builder.setMessage("Sistemden çıkış yapmak istediğinizden emin misiniz?");
            builder.setIcon(R.drawable.ic_question_answer);

            builder.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.setNegativeButton("HAYIR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.setNeutralButton("İPTAL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        });
    }
}