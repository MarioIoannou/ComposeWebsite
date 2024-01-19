package org.marioioannou.kobwebproject1.styles

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.marioioannou.kobwebproject1.utils.Res

@Composable
fun iconButton(
    modifier: Modifier = Modifier,
    colorMode: ColorMode,
    link: String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
    onClick: (() -> Unit)? = null
){
    Link(path = link) {
        Box(
           modifier = Modifier
               .padding(all = 8.px)
               .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
               .cursor(Cursor.Pointer)
               .border(
                   width = 2.px,
                   style = LineStyle.Solid,
                   color = if (colorMode.isLight) Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                   else Res.Theme.SOCIAL_ICON_BACKGROUND_DARK.color
               )
               .onClick { onClick?.invoke() }
        ){
            Image(
                modifier = Modifier.size(iconSize),
                src = icon
            )
        }
    }
}

enum class SocialIcon(
    val icon: String,
    val link: String
){
    Github(
        icon = Res.Icon.ICON_GITHUB_BLACK,
        link = "https://github.com/MarioIoannou"
    ),
    GithubLight(
    icon = Res.Icon.ICON_GITHUB_WHITE,
    link = "https://github.com/MarioIoannou"
    )
}