package com.example.week1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Week7 extends AppCompatActivity {
//    EditText ed1,ed2;
//    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_week7);
                DatabaseHandler db = new DatabaseHandler(this);
                db.addContact(new Contact("aaa","12345678"));
                db.addContact(new Contact("bbb","12345678"));
                db.addContact(new Contact("ccc","12345678"));
                List<Contact> contacts = db.getAllContacts();
        //for (int i=0)
        String[] datas = new String[contacts.size()];
        for(int i=0; i<datas.length; i++)
        {
            datas[i]= contacts.get(i)._name;
            Toast.makeText(getApplicationContext(), contacts.get(i)._name, Toast.LENGTH_LONG).show( );
        }



    }
}
