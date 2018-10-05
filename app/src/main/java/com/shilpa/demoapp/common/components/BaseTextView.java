package com.shilpa.demoapp.common.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.shilpa.demoapp.R;
import com.shilpa.demoapp.common.Font;


public class BaseTextView extends AppCompatTextView {
    public BaseTextView(Context context) {
        super(context);
    }

    public BaseTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context, attrs);
    }

    private void setFont(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray array = context.obtainStyledAttributes(attributeSet, R.styleable.baseTextView);
            int font = array.getInt(R.styleable.baseTextView_font_name, -1);
            Typeface typeface = Font.getFontType(context, font);
            if (typeface != null) {
                setTypeface(typeface);
            }
            array.recycle();
        }
    }

}
