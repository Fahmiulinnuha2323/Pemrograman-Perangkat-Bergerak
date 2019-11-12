package com.funqud.clubindonesia;

import java.util.ArrayList;

public class ClubData {
    private static int[] clubid = {
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
    };
    private static String[] clubNames = {
            "AREMA FC",
            "PERSIB",
            "PERSIJA",
            "MADURA UNITED",
            "BALI UNITED",
            "BHAYANGKARA FC",
            "PERSIPURA",
            "PSS",
            "PSM",
            "SEMEN PADANG FC"
    };

    private static String[] clubDetails = {
            "Arema FC (dahulu bernama Arema Malang), atau biasa disebut dan dikenal sebagai Arema Cronus, adalah sebuah klub sepak bola profesional yang berasal dari Malang, Jawa Timur, Indonesia. Arema didirikan pada tanggal 11 Agustus 1987, Arema mempunyai julukan Singo Edan. Dalam Liga 1, Arema berhome base di Stadion Kanjuruhan, Kabupaten Malang dan Stadion Gajayana, Kota Malang. Arema adalah tim sekota dari Arema Indonesia, Persema Malang, Persekam Metro, dan Malang United. Sejak hadir di dunia sepakbola nasional, Arema telah menjadi ikon dari warga Malang Raya (Kota Malang, Kabupaten Malang, Kota Batu) dan sekitarnya. Sebagai perwujudan dari simbol Arema, hampir di setiap sudut kota hingga gang-gang kecil terdapat patung dan gambar singa. Kelompok suporter mereka dipanggil Aremania dan Aremanita (untuk pendukung wanita)",
            "Persib Bandung (Persatuan Sepak Bola Indonesia Bandung), Pérsib Bandung adalah klub sepak bola Indonesia yang berdiri pada 14 Maret 1933, berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga 1 2019 Indonesia. Julukan mereka adalah Maung Bandung dan Pangeran Biru. Sponsor utama dan terbesar masih di pegang Indofood dan apparel jersey yang terbaru adalah Sportama. Sebagai tim yang dikenal baik, Persib juga sering menjadi penyumbang pemain ke tim nasional baik junior maupun senior. Sederet nama seperti Ade Dana, Emen Suwarman, Aang Witarsa, Max Timisela, Risnandar Soendoro, Nandar Iskandar, Adeng Hudaya, Herry Kiswanto, Ajat Sudrajat, Yusuf Bachtiar, Dadang Kurnia, Robby Darwis, Budiman, Nur'alim, Yaris Riyadi hingga generasi Erik Setiawan, Eka Ramdani, Gian Zola, dan Febri Hariyadi, merupakan sebagian pemain timnas hasil binaan Persib.",
            "Persija (singkatan dari Persatuan Sepak Bola Indonesia Jakarta) adalah sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga 1. Persija merupakan klub sepakbola paling sukses di sejarah sepakbola Indonesia dengan torehan 11 kali juara liga domestik hingga sejauh ini. Persija didirikan pada 28 November 1928, tepat sebulan setelah Sumpah Pemuda, dengan cikal bakal bernama Voetbalbond Indonesische Jacatra (VIJ). VIJ merupakan salah satu klub yang ikut mendirikan Persatuan sepak bola Seluruh Indonesia (PSSI) dengan keikutsertaan wakil VIJ, Mr. Soekardi dalam pembentukan PSSI di Societeit Hadiprojo Yogyakarta, Sabtu-19 April 1930.",
            "Sejarah berdirinya Madura United terjadi pada hari ini 10 Januari 2016. Berawal dari pergerakan yang dilakukan oleh CEO PT Polana Bola Madura Bersatu Achsanul Qosasi yang mengakuisisi penuh Persipasi Bandung Raya (PBR). Madura United FC merupakan klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura. Klub ini sebelumnya bernama Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia. Pemilik Pelita Bandung Raya, Ari D. Sutedi akhirnya menjual klubnya ke Achsanul Qosasi, dan kemudian bertransformasi menjadi Madura United FC. Kini, Madura United menjelma menjadi salah satu klub terkuat di liga utama Indonesia.",
            "Bali United F.C. (sebelumnya bernama Persisam Putra Samarinda) merupakan sebuah klub sepak bola Indonesia, yang bermarkas Stadion Kapten I Wayan Dipta, Kabupaten Gianyar, Provinsi Bali, Indonesia. Klub ini dulunya bernama Persatuan Sepak Bola Indonesia Samarinda (Persisam) yang merupakan eks tim Perserikatan dan Putra Samarinda dari Galatama. Pada 15 Februari 2015, Putra Samarinda diambil alih pengusaha asal Indonesia, Pieter Tanuri, setelah sebelumnya mengalami kesulitan finansial hingga akhirnya berpindah kandang ke Bali dan mengubah namanya menjadi Bali United F.C. Pada tanggal 17 Juni 2019, Bali United menjadi klub pertama yang memiliki saham go public di Asia Tenggara dan kedua di Asia. Pada pembukaan perdagangan perdananya, harga saham perusahaan langsung melambung 69,14 persen ke level Rp.296 per saham dari nilai saham perdana Rp.175 per lembar. klub ini melepas 33,33% kepemilikannya dengan total 2 miliar unit saham. Dengan demikian, dana yang diraup oleh klub ini mencapai 350 miliar rupiah.",
            "Bhayangkara FC adalah sebuah tim sepak bola Indonesia yang dimiliki oleh Polri yang berbasis di DKI Jakarta. Klub ini bermain di Liga 1. Klub ini juga memegang rekor sebagai klub dengan pergantian nama terbanyak di Indonesia, semuanya karena dualisme yang pernah terjadi antara klub ini dengan klub Persebaya Surabaya pada rentang waktu 2010 sampai 2016. Bhayangkara Surabaya United menggunakan Stadion Gelora Delta di Sidoarjo sebagai laga kandang mereka. Pada tanggal 24 April 2016, Bhayangkara SU mengadakan launching tim di ajang pertandingan Trofeo Kapolda Jatim dengan mengundang Madura United FC dan Deltras Sidoarjo untuk memeriahkannya. Pada saat itu, Bhayangkara SU menjadi juara trofeo setelah mengalahkan Deltras Sidoarjo 4-0. Selain di Stadion Gelora Delta, Bhayangkara Surabaya United juga menggunakan Stadion Gelora Bung Tomo, Surabaya sebagai stadion alternatif. Mungkin, sebagai tempat apabila Stadion Gelora Delta dipakai Deltras Sidoarjo, maka Bhayangkara SU menggunakan Stadion Gelora Bung Tomo.",
            "Persatuan Sepak bola Indonesia Jayapura (disingkat Persipura Jayapura) adalah sebuah klub sepak bola Indonesia yang bermarkas di Jayapura, Papua. Prestasi tertingginya hingga kini adalah menjadi empat kali juara Liga Indonesia dari tahun 2005 hingga 2013[1]. Di era Perserikatan, prestasi Persipura adalah runner-up Divisi Utama (1980) dan dua kali juara Divisi I (1979 dan 1993). Persipura juga dikenal sebagai klub bola yang melahirkan pemain lokal yang berkualitas internasional seperti Boaz Solossa, Ardiles Rumbiak, Chris Yarangga, Christian Warobay, Erol Iba, Gerald Pangkali, Jack Komboy, Yohanes Auri, Stevie Bonsapia, Titus Bonai, Jendri Pitoy, Eduard Ivakdalam, Ricardo Salampessy dan Patrich Wanggai.",
            "Persatuan Sepak bola Sleman (biasa disingkat: PSS). (Persatuan Bal-balan Sléman) merupakan sebuah klub sepak bola yang berbasis di Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia. Klub yang didirikan pada 20 Mei 1976 ini merupakan salah satu klub sepak bola yang disegani di Indonesia dan memiliki julukan sebagai tim Elang Jawa atau Elja. Klub ini juga sering disebut dengan julukan Laskar Sembada. Mereka bermain di Liga 1 dalam sebuah kompetisi sepak bola Indonesia, Liga Indonesia. Prestasi tertingginya dalam kompetisi kasta tertinggi Liga Indonesia adalah dua tahun berturut-turut menempati empat besar pada Divisi Utama Liga Indonesia 2003 dan Divisi Utama Liga Indonesia 2004. Stadion utama mereka adalah Stadion Maguwoharjo, dan menggunakan Stadion Tridadi sebagai stadion kedua. PSS juga memiliki suporter yang sangat militan dan dikenal sampai ke luar negeri yakni Slemania dan Brigata Curva Sud (BCS x PSS).",
            "Persatuan Sepak bola Makassar (disingkat PSM Makassar) adalah sebuah tim sepak bola Indonesia yang berbasis di Makassar, Sulawesi Selatan, Indonesia, yang dikenal pasukan Ramang atau Juku Eja. PSM Makassar saat ini bermain di Shopee Liga 1, setelah sebelumnya pernah bermain di Liga Primer Indonesia. PSM Makassar merupakan salah satu tim terkuat di Indonesia dan telah mewakili Indonesia dalam Liga Champions Asia sebanyak tiga kali. PSM Makassar merupakan tim dengan catatan prestasi paling stabil di pentas Liga Indonesia, dengan sekali menjadi juara, empat kali runner up, dan hanya sekali gagal masuk putaran final. PSM Makassar adalah tim tertua di Indonesia. Pada tahun 2014, PSM Makassar kembali ke Liga Super Indonesia setelah lolos play-off unifikasi liga PSSI.",
            "Semen Padang Football Club (dahulu Persatuan Sipak Bola Semen Padang) adolah sabuah klub sepak bola nan dipunyoi dek PT Semen Padang nan marupoan parusahaan semen paliang tuo di Indonesia. Klub sipak bola iko, bakandang di Indarung, Padang, Sumatera Barat, nan mamainan patandiangan kandangnyo di Stadion Agus Salim. Klub iko mamainan patandiangan kandangnyo di Stadion Agus Salim nan bakapasitas 20.000 panonton. Semen Padang FC badiri pado tanggal 30 November 1980.[1] Mangawali debut di kancah sipak bola Indonesia malalui Divisi 1 Galatama taun 1980. Pado taun 1982, SPFC barasil manjuarai Divisi 1 Galatama jo sakaligus promosi ka Divisi Utama Galatama."
    };

    private static int[] clubImages = {
            R.drawable.arema2,
            R.drawable.persib2,
            R.drawable.persija2,
            R.drawable.maduraunited2,
            R.drawable.bali4,
            R.drawable.bayangkara4,
            R.drawable.persipura2,
            R.drawable.pss4,
            R.drawable.psm2,
            R.drawable.semenpadang2
    };

    static ArrayList<Club> getListData() {
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position < clubNames.length; position++) {
            Club club = new Club();
            club.setId(clubid[position]);
            club.setName(clubNames[position]);
            club.setDetail(clubDetails[position]);
            club.setPhoto(clubImages[position]);
            list.add(club);
        }
        return list;
    }

}
