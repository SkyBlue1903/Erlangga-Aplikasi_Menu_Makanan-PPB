package com.example.erlangga_menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ModelMenu> mList;
    private AdapterMenu mAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();
        mList.add(
                new ModelMenu(
                        R.drawable.steaktempe,
                        "Steak Tempe",
                        "Berbeda dengan steak pada umumnya yang berbahan dasar daging. Kali ini, olahan steak nya akan menggunakan tempe sebagai bahan baku utama. Pertama-tama, tempe dikukus, ditumbuk, lalu disirami dengan bumbu khas Indonesia. Setelah itu, campurkan ke tepung terigu dan goreng sampai matang. Sajian menu seperti ini sangat mudah ditemui di warung makan yang ada di pinggir jalan. Soal rasa, tetap enak. Steak ini juga bergizi karena terbuat dari dari olahan tempe.",
                        8000));
        mList.add(
                new ModelMenu(
                        R.drawable.nasigoreng,
                        "Nasi Goreng",
                        "Nasi goreng selalu jadi menu andalan di beberapa tempat makan, baik di warung, kafe, ataupun restoran. Tapi, tidak semua tempat makan memiliki cita rasa nasi goreng yang sama. Misalnya saja Nasi Goreng Kambing Kebon Sirih. Warung nasi goreng yang satu ini sudah tidak perlu dipertanyakan lagi ya. Setiap hari pasti selalu ramai didatangi pengunjung. Wajar saja, cita rasa nasi gorengnya memang sangat khas. Apalagi dengan siraman potongan daging kambing di atasnya, membuat semua orang pasti ketagihan.",
                        10000));
        mList.add(
                new ModelMenu(
                        R.drawable.pepes,
                        "Pepes",
                        "Satu masakan khas Indonesia yang tidak boleh kelewatan adalah pepes. Makanan ini bisa ditemukan di banyak tempat. Tapi, satu warung pepes yang wajib dicoba adalah RM. Amper 2 yang ada di Jakarta. Disini, kamu bisa menikmati berbagai macam aneka pepes, baik pepes ikan teri, jeroan, tahu, sampai pepes ayam. Uniknya lagi, kedai pepes ini buka 24 jam penuh. Kamu yang sering kelaparan tengah malam cocok sekali kalau mau mampir ke sini.",
                        5000));
        mList.add(
                new ModelMenu(
                        R.drawable.ayambakar,
                        "Ayam Bakar",
                        "Olahan ayam goreng memang sangat menggoyang lidah, apalagi kalau dicampur dengan sambal cobek. Rasanya pasti mantap. Kalau ayam goreng melulu, pasti bosan. Bagaimana kalau ayam bakar? Aneka bumbu tradisional yang dioleskan ke dagingnya saat proses pembakaran menambah cita rasa ayam bakar. Bukan hanya lezat dan gurih saja, ayam bakar juga bagus buat kamu yang sedang diet. Karena ayam ini sama sekali tidak menggunakan minyak. Nikmati bersama sambal korek atau sambal pedas manis supaya rasanya semakin nikmat.",
                        16000));
        mList.add(new ModelMenu(
                R.drawable.gadogado,
                "Gado-Gado",
                "Makanan yang satu ini sudah pasti dikenal oleh sejuta umat karena sering ditemukan di warung sarapan pagi. Satu porsi gado-gado biasanya berisi potongan lontong, aneka sayur, tempe, tahu dan telur rebus. Supaya makin nikmat, gado-gado pun disiram dengan bumbu kacang dan ditaburi dengan kerupuk. Meskipun disajikan dengan sangat sederhana, tapi menu gado-gado selalu jadi menu favorit di pagi hari. Selain harganya murah, makanan ini juga sehat dan mengenyangkan.",
                13000));
        mList.add(new ModelMenu(
                R.drawable.perkedel,
                "Perkedel Kentang",
                "Makan sup tanpa perkedel itu rasanya sedikit hampa karena perkedel sudah lama menjadi teman setia dari olahan sup apapun. Tanpa dicampur ke menu apapun, perkedel kentang tetap gurih saat dimakan. Apalagi kalau ditambah dengan saus cabai. Masakan yang satu ini bisa kamu temukan dimana saja, khususnya di warung sarapan pagi. Harga satu buah perkedel kentang pun sangat murah. Jadi, jangan ragu kalau mau beli banyak.",
                3500));
        mList.add(new ModelMenu(
                R.drawable.capcay,
                "Capcay",
                "Satu masakan lagi sebelum menutup ulasan kali ini adalah capcay. Aneka sayur-mayur yang ditambahkan ke dalam kuah kaldu, lalu disiram dengan potongan daging sapi. Rasanya sangat nikmat! Selain nikmat, menu capcay juga sangat sehat karena didominasi oleh sayur-mayur. Kamu bisa membeli menu capcay di warung bakmi atau bisa juga berkreasi membuat menu capcay sendiri di rumah.",
                12000));

        mAdapter = new AdapterMenu(this, mList);
        recyclerView.setAdapter(mAdapter);
    }
}