package com.jniu.baidutakeoutui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/9/8.
 */
public class DivisionText extends TextView {

    public DivisionText(Context context) {
        super(context);
    }

    public DivisionText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.GRAY);
    }

    public DivisionText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
