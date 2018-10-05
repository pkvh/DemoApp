package com.shilpa.demoapp.common;

import android.content.Context;
import android.graphics.Typeface;


public class Font {
    private final static int LATO_REGULAR = 0;
    private final static int LATO_LIGHT = 1;
    private final static int LATO_LIGHT_ITALIC = 2;
    private final static int LATO_HAIRLINE = 3;
    private final static int ROBOTO_REGULAR = 4;
    private final static int ROBOTO_LIGHT = 5;
    private final static int ROBOTO_MEDIUM = 6;
    private final static int ROBOTO_BOLD = 7;
    private final static int ROBOTO_BOLD_CONDENSED = 8;
    private final static int SF_REGULAR = 9;

    public static Typeface getFontType(Context context, int fontSetInXML) {
        String fontName = null;
        switch (fontSetInXML) {
            case LATO_REGULAR :
                fontName = "lato-regular.ttf";
                break;
            case LATO_LIGHT :
                fontName = "Lato-Light.ttf";
                break;
            case LATO_LIGHT_ITALIC:
                fontName = "Lato-LightItalic.ttf";
                break;
            case LATO_HAIRLINE:
                fontName = "Lato-Hairline.ttf";
                break;

            case ROBOTO_REGULAR:
                fontName = "RobotoRegular.ttf";
                break;
            case ROBOTO_BOLD:
                fontName = "RobotoBold.ttf";
                break;
            case ROBOTO_LIGHT:
                fontName = "RobotoLight.ttf";
                break;
            case ROBOTO_BOLD_CONDENSED:
                fontName = "RobotoBoldCondensed.ttf";
                break;
            case ROBOTO_MEDIUM:
                fontName = "RobotoMedium.ttf";
                break;
            case SF_REGULAR:
                fontName = "SF_regular.ttf";
                break;

        }
        if (fontName == null) {
            return null;
        } else
            return Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName);

    }
}
