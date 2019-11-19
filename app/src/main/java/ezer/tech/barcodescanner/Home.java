package ezer.tech.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initComponents();
    }

    private void initComponents() {
        findViewById(R.id.scan_qr).setOnClickListener(this);
        findViewById(R.id.scan_pic).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.scan_qr:
                startActivity(new Intent(this, ScanQRCode.class));
                break;

            case R.id.scan_pic:
                startActivity(new Intent(this, ScanAsPicture.class));
                break;
        }
    }
}
