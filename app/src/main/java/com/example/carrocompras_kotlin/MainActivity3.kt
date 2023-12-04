package com.example.carrocompras_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carrocompras_kotlin.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AdaptadorProducto

    var listaProductos = ArrayList<Producto>()
    var carroCompras = ArrayList<Producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        agregarProductos()

        setupRecyclerView()
    }

    fun setupRecyclerView() {
        binding.rvListaProductos.layoutManager = LinearLayoutManager(this)
        adapter = AdaptadorProducto(this, binding.tvCantProductos, binding.btnVerCarro, listaProductos, carroCompras)
        binding.rvListaProductos.adapter = adapter
    }

    fun agregarProductos() {
        listaProductos.add(Producto("1", "audifonos ", "La mejor calidad de sonido la obtienes con los audífonos de alta fidelidad que puedes comprar", 30000.0))
        listaProductos.add(Producto("2", "computadora", "Encuentra computadoras de alto rendimiento y potencia tu productividad y entretenimiento", 380000.0))
        listaProductos.add(Producto("3", "drone", "Venta de drones en Chile a precios muy baratos y con la calidad que siempre buscaste. ¡Diviértete! Ya lo sabes, busca en nuestro catálogo online ahora.", 50000.0))
        listaProductos.add(Producto("4", "vr", "Lentes VR nuevos y acondicionados al mejor precio del mercado en Chile", 280000.0))
    }
}