package info.nellis.bismillahkalkulatorfix_a11202012668nellisneria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonHasil = (Button) findViewById(R.id.buttonHasil);
        final RadioGroup radioGroupOperasi = (RadioGroup) findViewById(R.id.radioGroupOperasi);

        buttonHasil.setOnClickListener(V) -> {
            RadioButton selectedButton = (RadioButton) findViewById(radioGroupOperasi.getCheckedRadioButtonId());
            EditText editTextAngka1    = (EditText) findViewById(R.id.editAngka1);
            EditText editTextAngka2    = (EditText) findViewById(R.id.editAngka2);
            Integer Angka1 = Integer.parseInt(editTextAngka1.getText().toString());
            Integer Angka2 = Integer.parseInt(editTextAngka2.getText().toString());
            String operasi = selectedButton.getText().toString();
            double hasil = 0;

            switch (operasi){
                case "Tambah" : hasil = Angka1 + Angka2; break;
                case "Kurang" : hasil = Angka1 - Angka2; break;
                case "Kali" : hasil = Angka1 * Angka2; break;
                case "Bagi" : hasil = (double) Angka1 / Angka2; break;
            }
            String ditampilkan = "Hasil " + operasi + " yaitu: " + hasil;

            Toast toast = Toast.makeText(getApplicationContext(). ditampilkan, Toast.LENGTH_LONG);
            toast.show();
        }
    }
}