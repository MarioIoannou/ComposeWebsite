package org.marioioannou.kobwebproject1.utils

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {

    enum class Theme(val color: Color) {
        BLACK(color = Color.rgb(r = 50, g = 54, b = 67)),
        BLUEISH(color = Color.rgb(r = 11, g = 96, b = 176)),
        LIGHT_BLACK(color = Color.rgb(r = 198, g = 198, b = 198)),
        DARK_BLACK(color = Color.rgb(r = 10, g = 10, b = 10)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 247, g = 247, b = 247)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 50, g = 54, b = 67)),
        //GRADIENT_ONE(color = Color.rgb(r = 189, g = 190, b = 190)),
        //GRADIENT_ONE(color = Color.rgb(r = 96, g = 100, b = 112)),
        GRADIENT_ONE(color = Color.rgb(r = 146, g = 154, b = 171)),
        //GRADIENT_TWO(color = Color.rgb(r = 242, g = 243, b = 243)),
        GRADIENT_TWO(color = Color.rgb(r = 247, g = 247, b = 247)),
    }
    object Icon {
        const val ICON_EMAIL_WHITE = "svg-mail-white.svg"
        const val ICON_EMAIL_BLACK= "svg-mail-black.svg"
        const val ICON_GITHUB_WHITE = "svg-github_white.svg"
        const val ICON_GITHUB_BLACK = "svg-github_black.svg"
        const val ICON_STAR_WHITE = "svg-star_white.svg"
        const val ICON_STAR_BLACK = "svg-star_black.svg"
        const val ICON_SUN_WHITE = "svg-sun_white.svg"
        const val ICON_SUN_BLACK = "svg-sun_black.svg"
        const val ICON_MOON_WHITE = "svg-moon_white.svg"
        const val ICON_MOON_BLACK = "svg-moon_black.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "image_profile.jpeg"
    }

    object String {
        const val NAME = "Marios Ioannou"
        const val PROFESSION = "ICT Engineer || Android Developer"
        const val ABOUT_ME = "Hello, my name is Mario, and I am deeply passionate about Android development. " +
                "My strength lies in transforming abstract ideas into tangible, user-focused applications, enriching each project with my unique insights and experiences. " +
                "While my heart lies in development, I am currently applying my broad technical skills and understanding of complex systems in my role as an ICT Engineer at Vermantia Productions, where I continue to contribute to innovative tech solutions."
        const val BTN_GET_IN_TOUCH = "Get in touch"
        const val INTER_BOLD = "Poppins-Bold"
        const val INTER_REGULAR = "Poppins-Regular"
        const val TEXT_EMAIL = "mailto:mariosiliasioannou@gmail.com"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}