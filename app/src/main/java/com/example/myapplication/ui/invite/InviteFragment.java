package com.example.myapplication.ui.invite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentInviteBinding;

public class InviteFragment extends Fragment {

    private FragmentInviteBinding binding;

    public static InviteFragment newInstance() {
        return new InviteFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InviteViewModel homeViewModel =
                new ViewModelProvider(this).get(InviteViewModel.class);

        binding = FragmentInviteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInvite;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}