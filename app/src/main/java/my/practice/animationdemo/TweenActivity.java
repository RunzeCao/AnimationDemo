package my.practice.animationdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TweenActivity extends AppCompatActivity {

    private Context mContext;

    @OnClick(R.id.alpha)
    void alpha(Button button) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000);
        button.startAnimation(anim);
    }

    @OnClick(R.id.rotate)
    void rotate(Button button) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -360f, button.getWidth() / 2, button.getHeight() / 2);
        rotateAnimation.setDuration(1000);
        button.startAnimation(rotateAnimation);
    }

    @OnClick(R.id.scale)
    void scale(Button button) {
        ScaleAnimation anim = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, button.getWidth() / 2, button.getHeight() / 2);
        anim.setDuration(1000);
        button.startAnimation(anim);
    }

    @OnClick(R.id.translate)
    void translate(Button button) {
        TranslateAnimation anim = new TranslateAnimation(0.0f, 0.0f, 0.0f, 500f);
        anim.setDuration(1000);
        button.startAnimation(anim);
    }

    @OnClick(R.id.set)
    void set(Button button) {
        AnimationSet anim = new AnimationSet(this, null);
        AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000);
        RotateAnimation rotate = new RotateAnimation(0.0f, -360f, button.getWidth() / 2, button.getHeight() / 2);
        anim.setDuration(1000);
        anim.addAnimation(alpha);
        anim.addAnimation(rotate);
        button.startAnimation(anim);
    }

    @BindView(R.id.imageView)
    ImageView imageView;

    @OnClick(R.id.interpolator)
    void interpolator() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.tween_anim);
        imageView.startAnimation(animation );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        mContext = this;
        ButterKnife.bind(this);
    }


}
