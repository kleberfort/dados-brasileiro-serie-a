package com.example.dadosdosjogosbrasileiroseriea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.dadosdosjogosbrasileiroseriea.databinding.ActivityMainBinding;
import com.example.dadosdosjogosbrasileiroseriea.fragments.BrasileiroA2022Fragment;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater()); //cia uma instãncia da classe de vinculação para atividade usar
        View view = binding.getRoot(); //referência direta para a visualização raiz
        setContentView(view);



        //Configurar adapter para abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Brasileiro A - 2022", BrasileiroA2022Fragment.class)
                .create()

        );
        //viewPager é area onde será carregado o conteúdo
        //viewPagerTab é onde teremos as abas
        binding.viewPager.setAdapter(adapter);
        binding.viewPagerTab.setViewPager(binding.viewPager);


    }
}