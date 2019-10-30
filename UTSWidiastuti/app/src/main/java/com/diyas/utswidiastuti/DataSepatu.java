package com.diyas.utswidiastuti;

import java.util.ArrayList;

public class DataSepatu {
    private static String[] sepatuNames = {
            "Wedges",
            "Kanvas",
            "Ankle Boots",
            "T-Straps",
            "Pumps",
            "Mules",
            "Mary Janes",
            "Loafers",
            "Trainers",
            "Oxfords"
    };
    private static String[] sepatuDetails = {
            "Tipe jenis ini kini sedang naik daun. Tipe sepatu wedges memiliki tipe khas yaitu sol nya tebal dan juga memiliki fungsi sebagai heels. Biasanya solnya akan lebih tebal di bagian belakang daripada di bagian depannya. Menjadikannya sepatu layaknya hak tinggi seperti pumps.",
            "Sepatu kanvas adalah sepatu casual yang digandrungi oleh banyak orang terutama anak muda. Ia biasanya dipakai untuk suasana santai atau untuk hang out dengan teman-teman. ",
            "Ankle Boots adalah jenis sepatu boots yang menutupi mata kaki dan bagian bawah kaki sang pemakai. Jenis sepatu ini dapat digunakan untuk suasana santai maupun formal.",
            "Tipe sepatu ini pertama kali dipopulerkan di tahun 1920-an. Cirinya adalah  strap melingkar di bagian pergelangan kaki yang membentuk huruf T. Meski memiliki kesan cantik dan anggun, tapi ada perdebatan apakah sepatu tipe ini temasuk ke dalam sepatu formal atau tidak. ",
            "Pumps adalah jenis sepatu berhak tinggi maupun sedang dengan bagian jari kaki tertutup. Pumps juga sering kali disebut dengan nama court shoes dan umumnya tidak bertali strap. Salah satu ciri khas sepatu pumps adalah hak yang tidak tajam seperti stiletto.",
            "Mules berasal dari kata bahasa Prancis yang berarti sandal berbentuk sepatu. Jadi Mules bentuknya seperti sandal yang depannya tertutup seperti sepatu dan terbuka di bagian belakang seperti sandal. Sandal ini memang sedang menjadi tren fashion karena berbagai kelebihan. Salah satunya adalah ia bisa di pakai santai maupun acara semi formal.",
            "Memiliki model tertutup, dengan potongan rendah dan punya strap di bagian tempurung kaki. Mary Jeans adalah salah satu sepatu yang mirip dengan dolly atau ballet shoes, tapi memiliki ciri khas yang berbeda. Cocok untuk digunakan dalam suasana informal.",
            "Loafers bisa jadi merupakan sepatu yang paling populer yang digunakan wanita. Biasanya loafers memiliki desain slip-on. Loafers sendiri disebut-sebut sebagai sepatu paling nyaman yang ada bagi wanita.",
            "Sepatu karet, sepatu atletik, sneakers, trainers, sepatu gym, adalah tipe-tipe sepatu yang sulit untuk dibedakan. Tapi, trainers adalah sepatu yang didesain untuk perempuan untuk memenuhi kebutuhan aktivitas olah raga yang dilakukan wanita.",
            "Sepatu tipe oxford ini memiliki karakter berupa tali sepatu di bagian depannya. Mulanya, sepatu ini didesain untuk digunakan dalam acara resmi, sebagai pasangan sepatu pantofel oxford untuk pria. Hanya saja, sekarang sudah ada banyak sepatu tipe oxford yang memiliki desain casual."

    };
    private static int[] sepatuImages = {
            R.drawable.wedges,
            R.drawable.kanvas,
            R.drawable.anklebots,
            R.drawable.tstraps,
            R.drawable.pumps,
            R.drawable.mules,
            R.drawable.maryjanes,
            R.drawable.loafers,
            R.drawable.trainers,
            R.drawable.oxford

    };

    private static String[] sepatuHarga={
            "Rp. 450.500 /pasang",
            "Rp. 230.000 /pasang",
            "Rp. 510.000 /pasang",
            "Rp. 330.000 /pasang",
            "Rp. 210.900 /pasang",
            "Rp. 270.000 /pasang",
            "Rp. 277.000 /pasang",
            "Rp. 200.000 /pasang",
            "Rp. 245.0000 /pasang",
            "Rp. 470.000 /pasang"
    };

    private static String[] sepatuUkuran={
            "37-41",
            "36-42",
            "36-40",
            "37-39",
            "38-41",
            "36-40",
            "36-39",
            "37-40",
            "38-41",
            "38-40"

    };

    static ArrayList<Sepatu> getListData() {
        ArrayList<Sepatu> list = new ArrayList<>();
        for (int position = 0; position < sepatuNames.length; position++) {
            Sepatu sepatu = new Sepatu();
            sepatu.setName(sepatuNames[position]);
            sepatu.setDetail(sepatuDetails[position]);
            sepatu.setPhoto(sepatuImages[position]);
            sepatu.setHarga(sepatuHarga[position]);
            sepatu.setUkuran(sepatuUkuran[position]);
            list.add(sepatu);
        }
        return list;
    }

}
