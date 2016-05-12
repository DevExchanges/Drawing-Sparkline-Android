package info.devexchanges.sparkline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView spark = (TextView)findViewById(R.id.spark);
        TextView mpChart = (TextView) findViewById(R.id.mp);

        spark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SparkActivity.class);
                startActivity(intent);
            }
        });

        mpChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MPAndroidChartActivity.class);
                startActivity(intent);
            }
        });
    }
}
