package eta.sudoku.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import eta.sudoku.R;
import eta.sudoku.model.VocabStorage;

public class VocabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocab);


        Button mFullVocabButton = (Button) findViewById(R.id.vocab_full_vocab);
        Button mWeekVocabButton = (Button) findViewById(R.id.vocab_week_vocab);
        mFullVocabButton.setText("Select Language");
        mWeekVocabButton.setText("Select WordList");

        mFullVocabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i = new Intent(VocabActivity.this, VocabFullActivity.class);
                startActivity(i);*/
                startActivity(new Intent(VocabActivity.this, SelectLanguageActivity.class));
            }
        });

        mWeekVocabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VocabActivity.this, SelectWordListActivity.class);
                startActivity(i);
            }
        });
    }
}
