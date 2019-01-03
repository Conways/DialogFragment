package com.conways.dialogfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by Conways on 2019/1/2
 * Describe:
 */
public class AlertDialog extends DialogFragment implements View.OnClickListener {


    private TextView tvTitle;
    private TextView tvContent;
    private TextView tvActionLeft;
    private TextView tvActionRight;


    private String title;
    private int titleColor;

    private String content;
    private int contentColor;

    private String actionLeft;
    private int actionLeftColor;

    private String actionRight;
    private int acitonRightColor;

    private OnActionLisenter leftAction;
    private OnActionLisenter rightAction;


    public AlertDialog() {
        initData();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.dialog_alert, container, false);
        init(view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        getDialog().getWindow().setBackgroundDrawableResource(R.drawable.bg_alert_dialog);
        getDialog().getWindow().setLayout(dm.widthPixels * 9 / 10, getDialog().getWindow().getAttributes().height);
    }

    void init(View view) {
        tvTitle = view.findViewById(R.id.dialog_alert_title);
        tvContent = view.findViewById(R.id.dialog_alert_content);
        tvActionLeft = view.findViewById(R.id.dialog_alert_action_left);
        tvActionRight = view.findViewById(R.id.dialog_alert_action_right);
        tvTitle.setTextColor(titleColor);
        tvTitle.setText(title);
        tvContent.setTextColor(contentColor);
        tvContent.setText(content);
        tvActionLeft.setTextColor(actionLeftColor);
        tvActionLeft.setText(actionLeft);
        tvActionRight.setTextColor(acitonRightColor);
        tvActionRight.setText(actionRight);

        tvActionLeft.setOnClickListener(this);
        tvActionRight.setOnClickListener(this);
    }

    void initData() {
        title = "提示";
        titleColor = 0xff000000;

        content = "系统提示";
        contentColor = 0xff666666;

        actionLeft = "取消";
        actionLeftColor = 0xff666666;

        actionRight = "确定";
        acitonRightColor = 0xffffffff;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dialog_alert_action_left:
                if (null == leftAction) {
                    this.dismiss();
                    break;
                }
                leftAction.onAction(this);
                break;
            case R.id.dialog_alert_action_right:
                if (null == rightAction) {
                    this.dismiss();
                    break;
                }
                rightAction.onAction(this);
                break;

            default:
                break;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public void setContentColor(int contentColor) {
        this.contentColor = contentColor;
    }

    public void setActionLeft(String actionLeft) {
        this.actionLeft = actionLeft;
    }


    public void setActionLeftColor(int actionLeftColor) {
        this.actionLeftColor = actionLeftColor;
    }

    public void setActionRight(String actionRight) {
        this.actionRight = actionRight;
    }


    public void setAcitonRightColor(int acitonRightColor) {
        this.acitonRightColor = acitonRightColor;
    }

    public void setLeftAction(OnActionLisenter leftAction) {
        this.leftAction = leftAction;
    }

    public void setRightAction(OnActionLisenter rightAction) {
        this.rightAction = rightAction;
    }

    public interface OnActionLisenter {
        void onAction(AlertDialog alertDialog);
    }
}
