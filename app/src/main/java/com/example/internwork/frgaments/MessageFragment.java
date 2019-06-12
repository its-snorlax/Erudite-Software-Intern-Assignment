package com.example.internwork.frgaments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.internwork.R;
import com.example.internwork.adapter.MessageAdapter;
import com.example.internwork.model.Message;

import java.util.ArrayList;

public class MessageFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message,container,false);

        ArrayList<Message> messages = new ArrayList<>();
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));
        messages.add(new Message(R.drawable.icon,"hello world","hey! This is Prayas Jain."));

        RecyclerView recyclerView = view.findViewById(R.id.recyler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        MessageAdapter messageAdapter = new MessageAdapter(messages);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(messageAdapter);

        return view;
    }
}
