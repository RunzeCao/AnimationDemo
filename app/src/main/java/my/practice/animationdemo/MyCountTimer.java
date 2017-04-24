package my.practice.animationdemo;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MyCountTimer extends CountDownTimer {
    private Button button;
    private TextView textView;
    private Context context;

    public MyCountTimer(long millisInFuture, long countDownInterval, Button button, TextView textView, Context context) {
        super(millisInFuture, countDownInterval);
        this.button = button;
        this.textView = textView;
        this.context = context;
    }


    @Override
    public void onTick(long millisUntilFinished) {
        //每隔一秒修改一次UI
        button.setEnabled(false);
        textView.setText(millisUntilFinished / 1000 + "");
      /*  AnimationSet animationSet = new AnimationSet(context, null);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0f);
        alphaAnimation.setDuration(1000);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 3f, 1f, 3f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(1000);

        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);*/
      Animation animation = AnimationUtils.loadAnimation(context,R.anim.timer_anim);
        textView.startAnimation(animation);
    }

    @Override
    public void onFinish() {
        button.setEnabled(true);
    }
}
