package com.example.dadosdosjogosbrasileiroseriea.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dadosdosjogosbrasileiroseriea.R;
import com.example.dadosdosjogosbrasileiroseriea.databinding.FragmentBrasileiroA2022Binding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BrasileiroA2022Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BrasileiroA2022Fragment extends Fragment {

    private FragmentBrasileiroA2022Binding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BrasileiroA2022Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BrasileiroA2022Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BrasileiroA2022Fragment newInstance(String param1, String param2) {
        BrasileiroA2022Fragment fragment = new BrasileiroA2022Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentBrasileiroA2022Binding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.tvFragmento.setText("Fragmento de brasileiro série A");
        binding.tvFragmento.setText("Alterado texto do fragmento");

        return view;
    }
}