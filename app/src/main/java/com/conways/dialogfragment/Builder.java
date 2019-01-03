package com.conways.dialogfragment;

/**
 * Created by Conways on 2019/1/2
 * Describe:
 */
public interface Builder {

    AlertDialogBuilder title(String title);


    AlertDialogBuilder titleColor(int titleColor);

    AlertDialogBuilder content(String content);


    AlertDialogBuilder contentColor(int contentColor);

    AlertDialogBuilder buttonLeft(String buttonLeft);


    AlertDialogBuilder buttonLeftColor(int buttonLeftColor);

    AlertDialogBuilder buttonRight(String buttonRight);


    AlertDialogBuilder buttonRightColor(int buttonRightColor);

    AlertDialogBuilder leftAction(AlertDialog.OnActionLisenter leftAction);

    AlertDialogBuilder rightAction(AlertDialog.OnActionLisenter rightAction);

    AlertDialog builder();

}
