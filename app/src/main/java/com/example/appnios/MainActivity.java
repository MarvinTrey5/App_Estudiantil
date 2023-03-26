package com.example.appnios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Se definen los objetos a necesitar.
    // Definimos un ViewPager para mostrar los objetos referenciados.
    ViewPager viewpager;
    ImageView Leon, Leopardo, Tigre, Hipopotamo, Jirafa,
            Rinoceronte, Cocodrilo, Puma, Pantera, Elefante;
    MediaPlayer Sonido, Sonido2;
    TextView T_Imagen0, T_Imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Se referencian los objetos.
        viewpager = findViewById(R.id.ViewPager);
        T_Imagen0= findViewById(R.id.Esp1);
        T_Imagen = findViewById(R.id.Esp2);
        Leon = findViewById(R.id.Image_1);
        Leon.setImageResource(R.drawable.leon);
        // Se referencia la primera imagen a darle clic.
        Leon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Se llama el método creado.
                Deten_Sonido();
                // Se declará un String para mostrar en español como se escribe.
                String animal1 = "León";
                // Se mostrará en el TextView
                T_Imagen0.setText(animal1);
                // Y que sea visible cuando inicia.
                T_Imagen0.setVisibility(View.VISIBLE);
                // Se referencia el primer sonido.
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.leon_esp);
                // Le decimos que inicie.
                Sonido.start();
                // Se referencia el segundo sonido.
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.lion_engl);
                // Se utiliza el método SetOnCompletionListener. Sirve para realizar
                // un acción es decir, al finalizar el primer audio.
                // Se ejecutará el otro.
                // Se referencia el primer Media Player llamado Sonido.
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Se define una variable para mostrar
                        // en el TextView al escucharlo en inglés.
                        String ver = "Lion";
                        // Se añade al textView referenciado.
                        T_Imagen.setText(ver);
                        // Y al ejecutarse será visible.
                        T_Imagen.setVisibility(View.VISIBLE);
                        // Se ejecuta el segundo Media Player.
                        Sonido2.start();
                    }
                });
            }
        });
        // De igual forma los demás ImageView se les hizo el mismo paso.
        // ---------------------------------------------------
        Leopardo = findViewById(R.id.Image_2);
        Leopardo.setImageResource(R.drawable.leopardo);
        Leopardo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen3, T_Image4;
                String leo = "Leopardo";
                T_Imagen3 = findViewById(R.id.Esp3);
                T_Image4 = findViewById(R.id.Esp4);
                T_Imagen3.setText(leo);
                T_Imagen3.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.leop_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.leop_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Leopard";
                        T_Image4.setText(ver_text);
                        T_Image4.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
        // ---------------------------------------------------
        Tigre = findViewById(R.id.Image_3);
        Tigre.setImageResource(R.drawable.tigre);
        Tigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen5, T_Image6;
                String tigre = "Tigre";
                T_Imagen5 = findViewById(R.id.Esp5);
                T_Image6 = findViewById(R.id.Esp6);
                T_Imagen5.setText(tigre);
                T_Imagen5.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.tigre_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.tigre_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Tiger";
                        T_Image6.setText(ver_text);
                        T_Image6.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
        // ---------------------------------------------------
        Hipopotamo = findViewById(R.id.Image_4);
        Hipopotamo.setImageResource(R.drawable.hipopotamo);
        Hipopotamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen7, T_Image8;
                String hipo = "Hipopótamo";
                T_Imagen7 = findViewById(R.id.Esp7);
                T_Image8 = findViewById(R.id.Esp8);
                T_Imagen7.setText(hipo);
                T_Imagen7.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.hipopo_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.hipopo_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Hippo";
                        T_Image8.setText(ver_text);
                        T_Image8.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
        // ---------------------------------------------------
        Jirafa = findViewById(R.id.Image_5);
        Jirafa.setImageResource(R.drawable.jirafa);
        Jirafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen9, T_Image10;
                String jira = "Jirafa";
                T_Imagen9 = findViewById(R.id.Esp9);
                T_Image10 = findViewById(R.id.Esp10);
                T_Imagen9.setText(jira );
                T_Imagen9.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.jirafa_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.jirafa_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Giraffe";
                        T_Image10.setText(ver_text);
                        T_Image10.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
        // --------------------------------------------------
        Rinoceronte = findViewById(R.id.Image_6);
        Rinoceronte.setImageResource(R.drawable.rinoceronte);
        Rinoceronte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen11, T_Image12;
                String rino = "Rinoceronte";
                T_Imagen11 = findViewById(R.id.Esp11);
                T_Image12 = findViewById(R.id.Esp12);
                T_Imagen11.setText(rino);
                T_Imagen11.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.rino_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.rino_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Rhinoceros";
                        T_Image12.setText(ver_text);
                        T_Image12.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
        // ---------------------------------------------------
        Cocodrilo = findViewById(R.id.Image_7);
        Cocodrilo.setImageResource(R.drawable.cocodrilo);
        Cocodrilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen13, T_Image14;
                String coco = "Cocodrilo";
                T_Imagen13 = findViewById(R.id.Esp13);
                T_Image14 = findViewById(R.id.Esp14);
                T_Imagen13.setText(coco);
                T_Imagen13.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.coco_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.coco_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Crocodrile";
                        T_Image14.setText(ver_text);
                        T_Image14.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
        // ---------------------------------------------------
        Puma = findViewById(R.id.Image_8);
        Puma.setImageResource(R.drawable.puma);
        Puma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen15, T_Image16;
                String puma = "Puma";
                T_Imagen15 = findViewById(R.id.Esp15);
                T_Image16= findViewById(R.id.Esp16);
                T_Imagen15.setText(puma);
                T_Imagen15.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.puma_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.puma_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Cougar";
                        T_Image16.setText(ver_text);
                        T_Image16.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
        // ---------------------------------------------------
        Pantera = findViewById(R.id.Image_9);
        Pantera.setImageResource(R.drawable.pantera);
        Pantera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen17, T_Image18;
                String pantera = "Pantera";
                T_Imagen17 = findViewById(R.id.Esp17);
                T_Image18= findViewById(R.id.Esp18);
                T_Imagen17.setText(pantera);
                T_Imagen17.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.panter_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.pante_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Panther";
                        T_Image18.setText(ver_text);
                        T_Image18.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
        // --------------------------------------------------
        Elefante = findViewById(R.id.Image_10);
        Elefante.setImageResource(R.drawable.elefante);
        Elefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deten_Sonido();
                TextView T_Imagen19, T_Image20;
                String elef = "Elefante";
                T_Imagen19 = findViewById(R.id.Esp19);
                T_Image20 = findViewById(R.id.Esp20);
                T_Imagen19.setText(elef);
                T_Imagen19.setVisibility(View.VISIBLE);
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.elef_esp);
                Sonido.start();
                Sonido2 = MediaPlayer.create(MainActivity.this, R.raw.elef_engl);
                Sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String ver_text = "Elephant";
                        T_Image20.setText(ver_text);
                        T_Image20.setVisibility(View.VISIBLE);
                        Sonido2.start();
                    }
                });
            }
        });
    }
    // Se crea un método para que cuando le demos clic
    // a un ImageView y queremos escuchar otro.
    // Al darle clic se detendrá y se escucharán los
    // Sonidos del Imageview escogido.
    public  void Deten_Sonido(){
        if(Sonido != null){
            Sonido.pause();
            Sonido.release();
            Sonido=null;
        } else if (Sonido2 != null) {
            Sonido2.pause();
            Sonido2.release();
            Sonido2 =null;
        }
    }
}