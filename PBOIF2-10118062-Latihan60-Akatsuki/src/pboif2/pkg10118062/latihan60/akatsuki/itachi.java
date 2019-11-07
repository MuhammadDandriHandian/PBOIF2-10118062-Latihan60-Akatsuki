/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan60.akatsuki;

/**
 *
 * @author ASUS
 */
public class itachi extends kelompokakatsuki {

     @Override
    public void tampil() {
      switch(getNama()){
          case "itachi":
        System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : konohagakure");
        System.out.println("umur : 21");
        System.out.println("status :  Meninggal");
        System.out.println("Cincin : 	朱 (\"Merah Darah\")");
        System.out.println("Posisi cincin :Jari manis kanan ");
        System.out.println("Ciri khas : Berambut belah tengah, ahli dalam Genjutsu, memakai sharingan dan mangekyo sharingan");
       break;
          case "pain":
        System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  Amegakure");
        System.out.println("status : Meninggal ");
        System.out.println("Cincin :  零 (\"Nol\",\"Tidak ada\")");
        System.out.println("Posisi cincin : Jempol kanan");
        System.out.println("Ciri khas : Memiliki besi hitam berupa tindikan di hampir seluruh tubuh, rambut berwarna jingga.");
        System.out.println("Jurus : Rine Tensei, Shinra Tensei, BanshoTein, Chibaku Tensei, Kuchiyose, Dan jurus Rine lainnya");  
      break;
         case"tobi":
            System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  konohagakure");
        System.out.println("status : Meninggal ");
        System.out.println("Cincin :  玉 (\"Nol\",\"berlian\")");
        System.out.println("Posisi cincin : Jempol kiri");
        System.out.println("Ciri khas : Topeng jingga dengan satu lubang mata dengan pola pusaran yang terpusat pada mata kanan. ");
        System.out.println("Mata kanannya memiliki Sharingan dan topeng putih dengan tiga lubang dengan titik di tengah mirip seperti \"Sharingan\".");
        System.out.println( "Saat perang dunia shinobi keempat"
                + ", mata kirinya berupa rinnegan.");  
       break;
          case"deidara":
          
        System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : Iwagakure ");
        System.out.println("status :  Meninggal");
        System.out.println("Cincin : 	青(\"Biru/Hijau\")");
        System.out.println("Posisi cincin :Telunjuk kanan ");
        System.out.println("Rekan kerja : sasori,kemudian tobi");
        System.out.println("Ciri khas : Berambut pirang dan dikuncir, spesialis ledakan menggunakan tanah liat dengan mulut di telapak tangan dan dada");      
        break;
          case"hidan":
        System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : yugakure ");
         System.out.println("umur : 22-23");
        System.out.println("status :  Lumpuh");
        System.out.println("Cincin : 	三 (\"Tiga\"))");
        System.out.println("Posisi cincin :Telunjuk kiri ");
        System.out.println("Rekan kerja : kakuzu");
        System.out.println("Ciri khas : Tidak bisa Mati, membawa sabit besar bermata tiga, rambut cepak berwarna pucat");      
        break;
           case"kakuzu" :
         System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : Takigakure ");
         System.out.println("umur : 91");
        System.out.println("status :  Almarhum");
        System.out.println("Cincin : 	北 (\"Utara\")");
        System.out.println("Posisi cincin : jari tangah kiri ");
        System.out.println("Rekan kerja : hidan");
        System.out.println("Ciri khas : Memakai penutup wajah, dapat memperpanjang hidupnya dengan cara mengambil jantung manusia");      
        break;
             case"kisame" :
        System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : Kirigakure ");
        System.out.println("umur : 31");
        System.out.println("status :  Almarhum");
        System.out.println("Cincin :  南 (\"Selatan\")");
        System.out.println("Posisi cincin : jari manis kiri ");
        System.out.println("Rekan kerja : itachi ");
        System.out.println("Ciri khas : Memiliki Kulit seperti ikan hiu, bergigi seperti ikan hiu.");      
        break;
         case"sasori" :
        System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  Sunagakure ");
        System.out.println("umur : 35");
        System.out.println("status :  Almarhum,diganti oleh tobi");
        System.out.println("Cincin :  玉 (\"Virgo\")");
        System.out.println("Posisi cincin : jempol kiri ");
        System.out.println("Rekan kerja : deidara ");
        System.out.println("Ciri khas : Berambut pendek berwarna merah. Bertubuh boneka sehingga tidak bisa menua. Ahli racun.");      
        break; 
         case"konan" :
        System.out.println("==============Profil=============");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  Amegakure ");
        System.out.println("umur : tidak diketahui");
        System.out.println("status :  Almarhum ");
        System.out.println("Cincin :  白 (\"Putih\")");
        System.out.println("Posisi cincin : jari tengah  ");
        System.out.println("Rekan kerja : pain ");
        System.out.println("Ciri khas : Memiliki aksesoris origami bunga di kepala, berambut biru.");      
        break;     
          default:
        System.out.println("Anggota tak di temukan");
    }
    
    
    }  
    
}
