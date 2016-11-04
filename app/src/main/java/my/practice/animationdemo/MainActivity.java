package my.practice.animationdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    protected Context mContext;

    @OnClick(R.id.tween)
    void goTween() {
        startActivity(new Intent(mContext, TweenActivity.class));
    }

    @OnClick(R.id.frame)
    void goFrame() {
        startActivity(new Intent(mContext, FrameActivity.class));
    }

    @OnClick(R.id.property)
    void goProperty() {
        startActivity(new Intent(mContext, PropertyActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        ButterKnife.bind(this);
    }

}
