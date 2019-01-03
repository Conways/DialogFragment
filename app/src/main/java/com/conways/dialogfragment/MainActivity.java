package com.conways.dialogfragment;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button = findViewById(R.id.tv);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialogBuilder()
                        .title("提示")
                        .titleColor(ActivityCompat.getColor(MainActivity.this, R.color.colorPrimaryDark))
                        .content("确定要这样做么")
                        .contentColor(ActivityCompat.getColor(MainActivity.this, R.color.colorPrimary))
                        .buttonLeft("取消")
                        .buttonRight("确定")
                        .leftAction(new AlertDialog.OnActionLisenter() {
                            @Override
                            public void onAction(AlertDialog alertDialog) {
                                alertDialog.dismiss();
                                Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .rightAction(new AlertDialog.OnActionLisenter() {
                            @Override
                            public void onAction(AlertDialog alertDialog) {
                                alertDialog.dismiss();
                                Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .builder();
                alertDialog.show(getSupportFragmentManager(), String.valueOf(hashCode()));

            }
        });
    }
}
