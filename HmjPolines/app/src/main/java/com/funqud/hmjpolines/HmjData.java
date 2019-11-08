package com.funqud.hmjpolines;

import android.content.Intent;

import java.util.ArrayList;

public class HmjData {
    private static int[] ukmid = {
            0,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11
    };
    private static String[] ukmNames = {
            "HMJ Elektro",
            "HMJ Akutansi",
            "HMJ AB",
            "HMJ Sipil",
            "HMJ Mesin",
            "UKM PCC",
            "UKM Konsep",
            "UKM Jazirah",
            "UKM KWU",
            "UKM PECC",
            "UKM SPORT",
            "UKM New PLBS FM"
    };

    private static String[] ukmDetails = {
            "Himpunan Mahasiswa Jurusan Teknik Elektro adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Elektro untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.\nHimpunan Mahasiswa Elektro Terdiri dari 5 Program Studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, Str Teknik Telekomunikasi\nVisi HME menjadikan HME sebagai fasilitator mahasiswa elektro yang berkualitas dan berbudi pekerti luhur serta sebagai himpunan mahasiswa jurusan terbaik sepanjang masa.",
            "Himpunan Mahasiswa Jurusan Akutansi adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan akutansi untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.\nHimpunan Mahasiswa Jurusan Akuntansi atau HiMA melaksanakan kegiatan yang menunjang akademik dan non akademik di lingkup jurusan akuntansi, yang bersifat eksekutif, aspiratif dan advokatif.\nTerdiri dari Pengurus Harian, Departemen Keagamaan, Departemen Penalaran, Departemen PSDM , Departemen Minbak, Departemen Humas, Departemen Perpustakaan dan Departemen KRT.",
            "Himpunan Mahasiswa Jurusan Administrasi Bisnis adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Administrasi Bisnis untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi, dan wadah aspirasi masyarakat Jurusan Administrasi Bisnis yang nantinya dikembangkan dan diaplikasikan dalam program-program yang meliputi : Penelitian dan Pengembangan, Minat dan Bakat, Pengabdian pada masyarakat, Serta kesejahteraan mahasiswa.\nVisi HM Administrasi Bisnis yaitu membangun komitmen Jurusan Administrasi Bisnis yang bersinergi untuk mewujudkan Mahasiswa yang berkarakter,inovatif dan prestatif.",
            "Himpunan Mahasiswa Jurusan Teknik Sipil adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organis asi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Sipil untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.\nVisi HMS Mewujudkan HMS POLINES menjadi Himpunan Mahasiswa Sipil terbaik di seluruh Indonesia, serta menjadi Teladan bagi mahasiswa lain. Dengan peningkatan kwalitas sumber daya manusia yang bermoral dan bertaqwa, berwawasan intelektual, berjiwa social, religious dan peduli terhadap lingkungan.",
            "Himpunan Mahasiswa Jurusan Teknik Mesin adalah salah satu Himpunan Mah asiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Mesin untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.\nOrganisasi ini bernama Himpunan Mahasiswa Jurusan Teknik Mesin Politeknik Negeri Semarang yang selanjutnya disingkat HMJ Teknik Mesin atau disebut HMM.\nHimpunan Mahasiswa Jurusan Teknik Mesin Politeknik Negeri Semarang atau HMM POLINES didirikan pada tahun 1984.",
            "Unit Kegiatan Mahasiswa Polytechnic Computer Club atau biasa disingkat UKM PCC, merupakan organisasi di Politeknik Negeri Semarang yang bergerak di bidang informasi dan teknologi. UKM Polytechnic Computer Club secara eksplisit terbagi menjadi dua bagian inti, yaitu Workshop dan Organisasi.\nWorkshop adalah bagian yang berfungsi untuk menggerakan roda kegiatan UKM Polytechnic Computer Club dalam lingkup teknologi. Pada bagian workshop, UKM Polytechnic Computer Club  memiliki fokus pada tiga bidang teknologi yaitu Software, Network, dan Multimedia.\nBagian organisasi merupakan bagian yang memiliki fungsi pengelolaan internal organisasi dari sisi sumber daya manusia dan program kerja serta membangun relasi internal maupun eksternal di Politeknik Negeri Semarang ",
            "UKM Komunitas Seni Polines merupakan satusatunya unit kegiatan mahasiswa di Politeknik Negeri Semarang yang bergerak di bidang Kesenian. Nama UKM Komunitas Seni Polines diresmikan pada tanggal 21 Juni 2003. Fungsi UKM KoNSeP adalah sebagai satu-satunya sarana pembangunan dan penyaluran minat dan bakat Mahasiswa Polines dalam bidang seni dan berorganisasi.\nAnggota UKM KoNSeP berasal dari mahsaiswa yang terdaftar dan pernah terdaftar sebagai mahasiswa Polines. Keanggotaan bersifat seumur hidup, kecuali ada hal-hal yang menyebabkan status keanggotaan dicabut. Anggota UKM KoNSeP terdiri dari anggota aktif dan anggota pasif.",
            "UKM JAZIRAH adalah Organisasi kemahasiswaan Politeknik Negeri Semarang yang bergerak di Civitas Akademika Politeknik Negeri Semarang khususnya dan masyarakat umumnya dalam bidang dakwah Islam, amar ma’ruf nahi mungkar, beraqidah Islam dan berlandaskan Al-Qur’an dan As-Sunnah. Dahulu UKM JAZIRAH bernama UKM ROHIS namun dengan adanya perkembangan zaman dan untuk meningkatkan semangat kader UKM ROHIS berganti nama menjadi UKM JAZIRAH pada tanggal 26 April 2008.\nKata JAZIRAH merupakan nama dari Unit Kegiatan Mahasiswa. Kata JAZIRAH berasal dari bahasa Arab yang artinya tanah (tempat).",
            "Unit Kegiatan Mahasiswa Kewirausahaan atau biasa disingkat UKM KWU, merupakan salah satu Unit Kegiatan Mahasiswa di Politeknik Negeri Semarang yang bergerak di bidang ekonomi. UKM Kewirausahaan dipimpin oleh seorang ketua yang biasa disebut Direktur.\nUKM KWU didirikan pada tanggal 13 Januari 2005 oleh seorang mahasiswa dari Jurusan Teknik Mesin yang bernama Kuntoro. UKM KWU menyatukan mahasiswa yang memiliki minat dan bakat untuk berwirausaha, serta mengajarkan tentang ilmu-ilmu berwirausaha yang tepat. UKM KWU membina dan melatih pengurusnya menjadi wirausaha muda yang siap menghadapi persaingan dunia.",
            "UKM PECC bergerak di bidang peningkatan kemampuan berbahasa Inggris bagi mahasiswa Politeknik Negeri Semarang.UKM PECC menerima penghargaan sebagai ORMAWA Terbaik pada tahun 2006/2007/2014 dan Runner-Up ORMAWA Terbaik pada tahun 2011/2012.UKM PECC diklaim sebagai ORMAWA favorit di Politeknik Negeri Semarang.\nVisi UKM PECC yaitu mengembangkan potensi mahasiswa Politeknik Negeri Semarang dalam kemampuan berbahasa Inggris dan berorganisasi sehingga terbentuk mahasiswa yang berkualitas dan mumpuni di era globalisasi.",
            "UKM Sport Politeknik Negeri Semarang terdiri dari 9 cabang olahraga yaitu sepak bola, futsal, badminton, tennis, volly, basket, taekwondo, karate, pencak silat.Unit Kegiatan Mahasiswa SPORT (UKM SPORT) ini didirikan sebagai wadah untuk menggali, membina, dan mengembangkan potensi mahasiswa dalam bidang minat bakat khususnya keolahragaan,disamping itu juga membina pribadi mahasiswa untuk lebih bertanggung jawab, sportif serta mempunyai budi pekerti yang luhur berdasarkan nilai-nilai Ketuhanan. Sehingga dapat berperan aktif dalam pengabdian masyarakat dan menjunjung tinggi nama baik almamater Politeknik Negeri Semarang.",
            "Sebuah ide untuk membuat sebuah inovasi dalam dunia broadcasting khususnya di Politeknik Negeri Semarang kala itu dengan mendirikan sebuah UKM Radio Kampus. Politeknik Negeri Semarang sebagai pihak institusi pun menyambut baik berdirinya sebuah UKM dalam bidang minat bakat didunia komunikasi dengan mendirikan UKM Radio Kampus.\nDimulai dengan serangkaian acara untuk menyambut kembali UKM Radio Kampus yang sempat vakum, diantaranya dengan acara Reborn Party. Sebuah acara untuk menyambut lahirnya kembali PLBS FM yang sempat mati suri, kemudian dengan tetap menggunakan nama PLBS FM namun dengan ditambahkan “New” di depan."
    };

    private static int[] ukmImages = {
            R.drawable.hme6,
            R.drawable.hmak6,
            R.drawable.hmab6,
            R.drawable.hms6,
            R.drawable.hmm6,
            R.drawable.pcc,
            R.drawable.konsep6,
            R.drawable.jazirah6,
            R.drawable.kwu,
            R.drawable.pecc6,
            R.drawable.sport6,
            R.drawable.plbs
    };
    //public static String[][] data = new String[][]{
      //      {"0", "HMJ Elektro", "Himpunan Mahasiswa Elektro Terdiri dari 5 Program Studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, Str Teknik Telekomunikasi", "https://i.postimg.cc/QxdcLRBk/hme.jpg"},
        //    {"1", "HMJ Sipil", "Himpunan Mahasiswa Jurusan Teknik Sipil adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Sipil untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi", "https://i.postimg.cc/yxBXSxYw/hms.jpg"},
          //  {"2", "HMJ Mesin", "Himpunan Mahasiswa Jurusan Teknik Mesin adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Mesin untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.", "https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
           // {"3", "HMJ Akutansi", "Himpunan Mahasiswa Jurusan Akutansi adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan akutansi untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.", "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            //{"4", "Himpunan Mahasiswa Jurusan Administrasi Bisnis adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusa Administrasi Bisnis untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.", "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"}
    //};

    //public static ArrayList<Hmj> getListData(){
      // ArrayList<Hmj> list = new ArrayList<>();
       //for (String[] aData : data){
         //  Hmj hmj = new Hmj();
           //hmj.setId(Integer.parseInt(aData[0]));
           //hmj.setName(aData[1]);
           //hmj.setDescription(aData[2]);
           //hmj.setPhoto(aData[3]);

           //list.add(hmj);
      // }
       //return list;
    //}
           static ArrayList<Hmj> getListData() {
               ArrayList<Hmj> list = new ArrayList<>();
               for (int position = 0; position < ukmNames.length; position++) {
                   Hmj ukm = new Hmj();
                   ukm.setId(ukmid[position]);
                   ukm.setName(ukmNames[position]);
                   ukm.setDescription(ukmDetails[position]);
                   ukm.setPhoto(ukmImages[position]);
                   list.add(ukm);
               }
               return list;
           }
}
