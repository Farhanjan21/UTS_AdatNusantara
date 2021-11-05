package id.ac.persiapan_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.bali,"Baju Adat Bali","Adat Bali",
                "Kebaya Bali sebelumnya tidak digunakan untuk kegiatan sehari-hari, namun hanya hari tertentu saja, seperti upacara adat dan ritual keagamaan.   " +
                "Nah, ternyata Bali memiliki beragam pakaian tradisional yang patut kita kena"))

        data?.add(DataModel(R.drawable.jateng,"Baju Adat Jawa Tengah","Adat Jateng",
                "Jawa Tengah memiliki budaya yang sangat erat kaitannya dengan budaya Jawa (Kejawen). Keraton Surakarta merupakan pusat dari kebudayaan di Jawa Tengah. " +
                "Oleh karenanya, Keraton Surakarta menjadi tujuan pagelaran seni dan budaya di provinsi ini."))

        data?.add(DataModel(R.drawable.jatim,"Baju Adat Jawa Timur","Adat Jatim",
                "Baju Pesa’an merupakan pakaian khas kota Madura dan sudah terkenal di berbagai daerah bahkan sampai mancanegara. Pakaian ini tentunya menjadi ikon bagi Jawa Timur." +
                "Baju Pesa’an adalah baju sederhana yang bisa digunakan untuk siapa saja, tanpa memandang status sosial yang mengenakannya. Pakaian ini bisa digunakan pada acara adat dan juga sehari-hari."))

        data?.add(DataModel(R.drawable.bugis,"Baju Adat bugis","Adat Bugis",
                "pakaian adat para pria Makassar disebut baju bella dada, yang berarti baju dengan belahan pada dada." +
                "Model bajunya berlengan panjang dengan leher berkerah dam dibubuhi kancing berwarna emas atau perak."))

        data?.add(DataModel(R.drawable.ntt,"Baju Adat Ntt","Adat Ntt",
                "pakaian adat Rote bisa dibilang" +
                "menjadi perwakilan dari berbagai baju adat daerah-daerah yang ada di provinsi NTT."))

        data?.add(DataModel(R.drawable.papua,"Baju Adat Papua","Adat Papua",
                "Koteka adalah pakaian tradisional untuk laki-laki yang cukup nyentrik karena ia memiliki fungsi untuk menutupi bagian kemaluan pria." +
                "saat menggunakan koteka, bagian tubuh lainnya dibiarkan terlihat seakan nyaris telanjang."))

        data?.add(DataModel(R.drawable.padang,"Baju Adat Padang","Adat Padang",
                "Dipadankan dengan berpakaian karung dan songket." +
                " Baju yang dikenakannya berupa sulaman emas dibagian tangan dan leher."))


        data?.add(DataModel(R.drawable.lampung,"Baju Adat Lampung","Adat Lampung",
                "Di luarnya, dibalut dengan sarung tumpal yaitu " +
                "kain sarung khas Lampung yang ditenun menggunakan benang emas. Sarung ini dipakai menutup celana dari pinggang hingga lutut."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.nomer)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}