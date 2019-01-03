package com.conways.dialogfragment;

/**
 * Created by Conways on 2019/1/2
 * Describe:
 */
public class AlertDialogBuilder implements Builder {

    private AlertDialog alertDialog;


    public AlertDialogBuilder() {
        alertDialog = new AlertDialog();
    }

    @Override
    public AlertDialogBuilder title(String title) {
        alertDialog.setTitle(title);
        return this;
    }


    @Override
    public AlertDialogBuilder titleColor(int titleColor) {
        alertDialog.setTitleColor(titleColor);
        return this;
    }

    @Override
    public AlertDialogBuilder content(String content) {
        alertDialog.setContent(content);
        return this;
    }

    @Override
    public AlertDialogBuilder contentColor(int contentColor) {
        alertDialog.setContentColor(contentColor);
        return this;
    }

    @Override
    public AlertDialogBuilder buttonLeft(String buttonLeft) {
        alertDialog.setActionLeft(buttonLeft);
        return this;
    }


    @Override
    public AlertDialogBuilder buttonLeftColor(int buttonLeftColor) {
        alertDialog.setActionLeftColor(buttonLeftColor);
        return this;
    }

    @Override
    public AlertDialogBuilder buttonRight(String buttonRight) {
        alertDialog.setActionRight(buttonRight);
        return this;
    }

    @Override
    public AlertDialogBuilder buttonRightColor(int buttonRightColor) {
        alertDialog.setAcitonRightColor(buttonRightColor);
        return this;
    }

    @Override
    public AlertDialogBuilder leftAction(AlertDialog.OnActionLisenter leftAction) {
        alertDialog.setLeftAction(leftAction);
        return this;
    }

    @Override
    public AlertDialogBuilder rightAction(AlertDialog.OnActionLisenter rightAction) {
        alertDialog.setRightAction(rightAction);
        return this;
    }

    @Override
    public AlertDialog builder() {
        return alertDialog;
    }
}
