package com.example.dadosdosjogosbrasileiroseriea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.dadosdosjogosbrasileiroseriea.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater()); //cia uma instãncia da classe de vinculação para atividade usar
        View view = binding.getRoot(); //referência direta para a visualização raiz
        setContentView(view);

        binding.tvNome.setText("kleber ferreira da silva");

        binding.tvNome.setText("12");


    }
}