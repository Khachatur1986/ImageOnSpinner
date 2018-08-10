package example.am.imageonspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * https://developer.android.com/guide/topics/ui/controls/spinner
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private TextView tv_gender_name;
    private Spinner sp_gender_2;
    private String [] genders = {"Select gender", "Male", "Female"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_gender_2 = (Spinner) findViewById(R.id.sp_gender_2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                R.layout.row_gender_spinner, R.id.tv_gender_name, genders);
        sp_gender_2.setAdapter(adapter2);

        Spinner spinner = (Spinner) findViewById(R.id.sp_gender);
        spinner.setOnItemSelectedListener(this);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
