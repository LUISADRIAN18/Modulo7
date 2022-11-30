package dgtic.unam.modulo7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dgtic.unam.modulo7.databinding.ActivityRecyclerViewBinding

class RecyclerView : AppCompatActivity() {
    private lateinit var binding:ActivityRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        initItemp()
    }
    private fun initItemp(){
        val recyclerView=binding.data
        recyclerView.layoutManager= LinearLayoutManager(this)
        val adapter=AdapterViewHolder(this,Source.dataList)
        recyclerView.adapter=adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()

        return true
    }
}
