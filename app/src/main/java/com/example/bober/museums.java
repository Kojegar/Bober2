package com.example.bober;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class museums extends AppCompatActivity {
Button button;
    final int DIALOG_EXIT = 1;
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(DIALOG_EXIT);
            }
        });
    }

    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_EXIT) {
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            // заголовок
            adb.setTitle("В хотите прослушать экскурсию?");
            // сообщение
            adb.setMessage("Да - Рассказчик будет показывать экспонаты и рассказывать о них" + "\n" + "Нет - Вы сможете сами посмотреть и прочитать про каждый экспонат");
            // кнопка положительного ответа
            adb.setPositiveButton(R.string.yes, myClickListener);
            // кнопка отрицательного ответа
            adb.setNegativeButton(R.string.no, myClickListener);
            return adb.create();
        }
        return super.onCreateDialog(id);
    }

    DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                // положительная кнопка
                case Dialog.BUTTON_POSITIVE:
                    saveData();
                    finish();
                    break;
                // негативная кнопка
                case Dialog.BUTTON_NEGATIVE:
                    suvData();
                    finish();
                    break;
            }
        }
    };

    void saveData() {
        Toast.makeText(this, "ок", Toast.LENGTH_SHORT).show();
    }
    void suvData(){
        Toast.makeText(this, "не ок", Toast.LENGTH_SHORT).show();
    }
}